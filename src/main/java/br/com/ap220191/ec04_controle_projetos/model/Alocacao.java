package br.com.ap220191.ec04_controle_projetos.model;

public class Alocacao
{
	private int cargaHoraria;
	private EstadoAlocacao estado;

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

	@Override
	public String toString()
	{
		return "Alocacao{"
			+ "cargaHoraria=" + cargaHoraria
			+ ", estado='" + estado  + "'"
			+ '}';
	}
}