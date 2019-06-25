package br.com.ap220191.ec04_controle_projetos.model;

public class Alocacao
{

//TODO: Classe incompleta, por favor, complementar a classe

	private int cargaHoraria;
	private EstadoAlocacao estadoAlocacao;
	
	public int getCargaHoraria()
	{
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}
	
	public EstadoAlocacao getEstadoAlocacao()
	{
		return estadoAlocacao;
	}

	public void setEstadoAlocacao(EstadoAlocacao estadoAlocacao)
	{
		this.estadoAlocacao = estadoAlocacao;
	}
	
	@Override
	public String toString()
	{
		return "Alocacao{"
			+ "cargaHoraria=" + cargaHoraria
			+ ", estadoAlocacao='" + estadoAlocacao  + "'"
			+ '}';
	}
}