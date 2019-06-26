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

public class ClienteCorreiosWs 
{
		private String cep;
		private HttpURLConnection conexao;
		private String xml;

		/**
		* Imprime a cadeia de String 'Endereco' sobre o cep informado
		* @param cep String no formato 00000000 ou 00000-000
		*/
		public void buscaCep(String cep)
		{
				this.cep = cep;
				xml = capturaXml();
				imprimeBusca();
		}

		/**
		* Recupera a referência ao objeto Endereco sobre o cep informado
		* @param cep String no formato 00000000 ou 00000-000
		* @return instancia de br.com.ap220191.ec04_controle_projetos.model.Endereco
		*/
		public Endereco buscaCepEndereco(String cep)
		{
				this.cep = cep;
				xml = capturaXml();
				Endereco endereco = new Endereco();
				if(isCepEncontrado())
				{
						endereco.setTipo(tipoLogradouro(extraiTagXml(xml, "end")));
						endereco.setNome(extraiTagXml(xml, "end"));
						endereco.setBairro(extraiTagXml(xml, "bairro"));
						endereco.setCep(cep);
						endereco.setCidade(extraiTagXml(xml, "cidade"));
						endereco.setEstado(extraiTagXml(xml, "uf"));
				}
				    return endereco;
		}

		private void conecta()
		{
				String url = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente";
				try
				{
						URL endereco = new URL(url);
						conexao = (HttpURLConnection) endereco.openConnection();
				}
				catch (IOException exception)
				{
						System.out.printf("URL incompleta \n%s\n", exception);
				}

				try
				{		    
						conexao.setDoOutput(true);
						conexao.setRequestMethod("POST");
						conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
						conexao.setRequestProperty("cache-control", "no-cache");
				}
				catch (ProtocolException exception)
				{
						System.out.printf("Protocolo de requisição inválido \n%s\n", exception);
				}

				try
				{
						requere();
				}
				catch (Exception exception)
				{
						System.out.printf("Requisicão não foi completada \n%s\n", exception);
				}
		}

		private void requere()
		{       
				String envelopeSoap =  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"" +
								    " xmlns:cli=\"http://cliente.bean.master.sigep.bsb.correios.com.br/\">"
										+ "<soapenv:Header/>"
										    + "<soapenv:Body>"
												+ "<cli:consultaCEP>"
												    + "<cep>"+ cep +"</cep>"
												+ "</cli:consultaCEP>"
										    + "</soapenv:Body>"
										+ "</soapenv:Envelope>";
				byte[] postData = envelopeSoap.getBytes(StandardCharsets.UTF_8);

				try (DataOutputStream requisicaoSoap = new DataOutputStream(conexao.getOutputStream()))
				{
						requisicaoSoap.write(postData);
				} catch (IOException exception)
				{
						System.out.printf("Erro ao enviar requisição \n%s\n", exception);
				}
		}

		private String capturaXml()
		{
				conecta();
				String xmlResposta = "";
				StringBuilder mensagem;

				try (BufferedReader buffer = new BufferedReader(new InputStreamReader(conexao.getInputStream())))
				{
						String linha;
						mensagem = new StringBuilder();
						while ((linha = buffer.readLine()) != null)
						{
								mensagem.append(linha);
								mensagem.append(System.lineSeparator());
						}
						xmlResposta = mensagem.toString();
				}
				catch (IOException exception)
				{
						//System.out.printf("Cep '%s' não encontrado\n", cep);
				}
				finally
				{
						desconecta();
				}
						return xmlResposta;
		}

		private void desconecta()
		{
				conexao.disconnect();
		}

		public boolean isCepEncontrado()
		{
				return xml.contains("<return>");
		}

		private String extraiTagXml(String xml, String tagName)
		{
				String valores = null;
				Document xmlDoc;
				if(isCepEncontrado())
				{
						xmlDoc = leStringXml(xml);
						NodeList nodeList = xmlDoc.getElementsByTagName(tagName);
						valores = (nodeList.item(0).getFirstChild().getNodeValue());
				}
				else
				{
						System.out.printf("Resultado não disponível\n");
				}
						return valores;
		}

		private Document leStringXml( String xml)
		{
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db;
				try
				{
						db = dbf.newDocumentBuilder();
						InputSource is = new InputSource(new StringReader(xml));
						return db.parse(is);
				}
				catch (ParserConfigurationException | SAXException | IOException exception)
				{
						System.out.printf("Não foi possível processar o xml \n%s\n", exception);
				}
						return null;
				}

		private String tipoLogradouro(String xml)
		{
				int inicio = xml.indexOf("");
				int fim = xml.indexOf(" ");
				String tipo = xml.substring(inicio, fim);
				return tipo;
		}

		private void imprimeBusca()
		{
				if(isCepEncontrado())
				{
						String nome = extraiTagXml(xml, "end");
						String tipo = tipoLogradouro(extraiTagXml(xml, "end"));
						String bairro = extraiTagXml(xml, "bairro");
						//String cep = extraiTagXml(xml, "cep");
						String cidade = extraiTagXml(xml, "cidade");
						String estado = extraiTagXml(xml, "uf");

						System.out.println("Endereco{"
								+ "tipo='" + tipo + "'"
								+ "nome='" + nome + "'"
								+ ", bairro='" + bairro + "'"
								+ ", cep='" + cep + "'"
								+ ", cidade='" + cidade + "'"
								+ ", estado='" + estado + "'"
								+ '}');
				}
				else
				{
						System.out.printf("Cep '%s' não encontrado\n", cep);
				}
		}
}