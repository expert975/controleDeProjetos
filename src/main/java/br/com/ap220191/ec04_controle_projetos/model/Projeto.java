package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;
import java.util.ArrayList;

public class Projeto
{
	private String nome;
	private Situacao situacao;
	private Date inicio;
	private Date conclusao;
	private long orcamento;
	private String descricao;
	private Departamento departamentoResponsavel;
	private ArrayList<AlteracaoSituacao> historia;
        private ConversorData conversor = new ConversorData();

	public Projeto (String nome, String inicio, String conclusao, long orcamento,
	                String descricao, Departamento departamentoResponsavel)
	{
		this.nome = nome;
		this.situacao = Situacao.ANDAMENTO;
		this.inicio = conversor.converterStringToDate(inicio);
		this.conclusao = conversor.converterStringToDate(conclusao);
		this.orcamento = orcamento;
		this.descricao = descricao;
		this.departamentoResponsavel = departamentoResponsavel;
	}

	public ArrayList<AlteracaoSituacao> getHistoria()
	{
		return historia;
	}

	public void setHistoria(ArrayList<AlteracaoSituacao> historia)
	{
		this.historia = historia;
	}

	public Departamento getDepartamentoResponsavel()
	{
		return departamentoResponsavel;
	}

	public void setDepartamentoResponsavel(Departamento departamentoResponsavel)
	{
		this.departamentoResponsavel = departamentoResponsavel;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public long getOrcamento()
	{
		return orcamento;
	}

	public void setOrcamento(long orcamento)
	{
		this.orcamento = orcamento;
	}

	public Date getConclusao()
	{
		return conclusao;
	}

	public void setConclusao(String conclusaoString)
	{
		this.conclusao = conversor.converterStringToDate(conclusaoString);
	}

	public Date getInicio()
	{
		return inicio;
	}

	public void setInicio(String inicioString)
	{
		this.inicio = conversor.converterStringToDate(inicioString);;
	}

	public Situacao getSituacao()
	{
		return situacao;
	}

	public void mudarSituacao(Situacao anterior, Situacao atual,
	                          String dataMudancaString, Colaborador agente, 
                                  String motivo)
	{
                Date dataMudanca = conversor.converterStringToDate(dataMudancaString);
		historia.add(new AlteracaoSituacao(anterior, atual, dataMudanca,
		                                   agente, motivo));
		this.situacao = atual;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return "Projeto{"
			+ "\nnome='" + nome + "'"
			+ "\nsituacao='" + situacao + "'"
			+ "\ninicio='" + inicio + "'"
			+ "\nconclusao='" + conclusao + "'"
			+ "\norcamento='" + orcamento + "'"
			+ "\ndescricao='" + descricao + "'"
			+ "\ndepartamentoResponsavel='" + departamentoResponsavel.getNome() + "'"
			+ "\nhistoria='" + historia + "'"
			+ "\n}";
	}
}
