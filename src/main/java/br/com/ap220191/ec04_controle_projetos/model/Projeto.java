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

	public Projeto(String nome, Date inicio, Date conclusao, long orcamento,
	               String descricao, Departamento departamentoResponsavel)
	{
		this.nome = nome;
		this.situacao = Situacao.ANDAMENTO;
		this.inicio = inicio;
		this.conclusao = conclusao;
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

	public void setConclusao(Date conclusao)
	{
		this.conclusao = conclusao;
	}

	public Date getInicio()
	{
		return inicio;
	}

	public void setInicio(Date inicio)
	{
		this.inicio = inicio;
	}

	public Situacao getSituacao()
	{
		return situacao;
	}

	public void mudarSituacao(Situacao situacao, Date dataMudanca,
	                          Colaborador agente, String motivo)
	{
		historia.add(new AlteracaoSituacao(this.situacao, situacao, dataMudanca,
		                                   agente, motivo));
		this.situacao = situacao;
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
			+ "nome='" + nome + "'"
			+ "situacao='" + situacao + "'"
			+ "inicio='" + inicio + "'"
			+ "conclusao='" + conclusao + "'"
			+ "orcamento='" + orcamento + "'"
			+ "descricao='" + descricao + "'"
			+ "departamentoResponsavel='" + departamentoResponsavel + "'"
			+ "historia='" + historia + "'"
			+ "}";
	}
}
