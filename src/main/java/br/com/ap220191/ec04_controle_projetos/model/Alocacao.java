package br.com.ap220191.ec04_controle_projetos.model;

public class Alocacao
{

	private int cargaHoraria;
	private EstadoAlocacao estado;
	private Colaborador colaborador;
	private Projeto projeto;

	public int getCargaHoraria()
	{
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}

	public EstadoAlocacao getEstado()
	{
		return estado;
	}

	public void setEstado(EstadoAlocacao estado)
	{
		this.estado = estado;
	}

	public Colaborador getColaborador()
	{
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador)
	{
		this.colaborador = colaborador;
	}

	public Projeto getProjeto()
	{
		return projeto;
	}

	public void setProjeto()
	{
		this.projeto = projeto;
	}

	@Override
	public String toString()
	{
		return "Alocacao{"
			+ "cargaHoraria=" + cargaHoraria
			+ ", estado='" + estado + "'"
			+ ", colaborador='" + colaborador + "'"
			+ ", projeto='" + projeto + "'"
			+ '}';
	}
}
