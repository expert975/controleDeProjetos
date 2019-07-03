package br.com.ap220191.ec04_controle_projetos.model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.ProtocolException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ApiCorreios
{
	/**
	* Recupera a referência ao objeto Endereco sobre o cep informado
	* @param cep String no formato 00000000 ou 00000-000
	* @return instância de br.com.ap220191.ec04_controle_projetos.model.Endereco
	*/
	public Endereco buscaEndereco(String cep) throws CorreiosException
	{
		Document xml;
		try
		{
			xml = consultaApi(cep);
		}
		catch(IOException | ParserConfigurationException | SAXException e)
		{
			throw new CorreiosException(e);
		}
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		endereco.setTipo(tipoLogradouro(extraiTagXml(xml, "end")));
		endereco.setNome(extraiTagXml(xml, "end"));
		endereco.setBairro(extraiTagXml(xml, "bairro"));
		endereco.setCidade(extraiTagXml(xml, "cidade"));
		endereco.setEstado(extraiTagXml(xml, "uf"));
		return endereco;
	}

	private Document consultaApi(String cep)
		throws IOException, ParserConfigurationException, SAXException
	{
		HttpURLConnection conexao = conecta();
		requere(conexao, cep);
		String xml = leResposta(conexao);
		conexao.disconnect();
		return leStringXml(xml);
	}

	private HttpURLConnection conecta() throws IOException
	{
		String url = "https://apps.correios.com.br/SigepMasterJPA/"
			+ "AtendeClienteService/AtendeCliente";
		HttpURLConnection conexao;
		URL endereco = new URL(url);
		conexao = (HttpURLConnection) endereco.openConnection();
		conexao.setDoOutput(true);
		conexao.setRequestMethod("POST");
		conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
		conexao.setRequestProperty("cache-control", "no-cache");
		return conexao;
	}

	private void requere(HttpURLConnection conexao, String cep)
		throws IOException
	{
		String envelopeSoap =
		"<soapenv:Envelope xmlns:soapenv=" +
		"\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cli=\"" +
		"http://cliente.bean.master.sigep.bsb.correios.com.br/\">" +
		    "<soapenv:Header/>" +
		    "<soapenv:Body>" +
		        "<cli:consultaCEP>" +
		            "<cep>"+ cep +"</cep>" +
		        "</cli:consultaCEP>" +
		    "</soapenv:Body>" +
		"</soapenv:Envelope>";
		byte[] postData = envelopeSoap.getBytes(StandardCharsets.UTF_8);
		try(DataOutputStream requisicaoSoap =
			new DataOutputStream(conexao.getOutputStream()))
		{
			requisicaoSoap.write(postData);
		}
		catch(IOException exception)
		{
			throw exception;
		}
	}

	private String leResposta(HttpURLConnection conexao) throws IOException
	{
		try(BufferedReader buffer =
			new BufferedReader(new InputStreamReader(conexao.getInputStream())))
		{
			String linha;
			StringBuilder mensagem = new StringBuilder();
			while((linha = buffer.readLine()) != null)
			{
				mensagem.append(linha);
				mensagem.append(System.lineSeparator());
			}
			return mensagem.toString();
		}
		catch(IOException exception)
		{
			throw exception;
		}
	}

	private Document leStringXml(String xml)
		throws ParserConfigurationException, SAXException, IOException
	{
		System.out.println(xml.contains("<return>"));
		System.out.println(xml);
		if(xml.contains("<return>"))
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(xml));
			return db.parse(is);
		}
		else
			throw new SAXException("Empty API reply");
	}

	private String extraiTagXml(Document xml, String tagName)
	{
		NodeList nodeList = xml.getElementsByTagName(tagName);
		return nodeList.item(0).getFirstChild().getNodeValue();
	}

	private String tipoLogradouro(String nome)
	{
		int inicio = nome.indexOf("");
		int fim = nome.indexOf(" ");
		String tipo = nome.substring(inicio, fim);
		return tipo;
	}
}
