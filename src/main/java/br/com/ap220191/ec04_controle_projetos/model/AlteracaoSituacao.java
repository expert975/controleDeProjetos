package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;

public class AlteracaoSituacao
{
	private Date data;
	private String motivo;
	private Colaborador agente;
	private Situacao anterior;
	private Situacao novo;

	public AlteracaoSituacao(Situacao anterior, Situacao novo, Date data,
	                         Colaborador agente, String motivo)
	{
		this.data = data;
		this.motivo = motivo;
		this.agente = agente;
		this.anterior = anterior;
		this.novo = novo;
	}

	public Colaborador getAgente()
	{
		return agente;
	}

	public void setAgente(Colaborador agente)
	{
		this.agente = agente;
	}

	public String getMotivo()
	{
		return motivo;
	}

	public void setMotivo(String motivo)
	{
		this.motivo = motivo;
	}

	public Date getData()
	{
		return data;
	}

	public void setData(Date data)
	{
		this.data = data;
	}

	public Situacao getNovo()
	{
		return novo;
	}

	public void setNovo(Situacao novo)
	{
		this.novo = novo;
	}

	public Situacao getAnterior()
	{
		return anterior;
	}

	public void setAnterior(Situacao anterior)
	{
		this.anterior = anterior;
	}

	@Override
	public String toString()
	{
		return "AlteracaoSituacao{"
			+ "data='" + data + "'"
			+ "motivo='" + motivo + "'"
			+ "agente='" + agente + "'"
			+ "anterior='" + anterior + "'"
			+ "novo='" + novo + "'"
			+ '}';
	}
}
