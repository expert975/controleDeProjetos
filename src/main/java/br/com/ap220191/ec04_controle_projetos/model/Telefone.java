package br.com.ap220191.ec04_controle_projetos.model;

public class Telefone {
	private String numero;
	private String operadora;
	private Mobilidade tipo;

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getOperadora()
	{
		return operadora;
	}

	public void setOperadora(String operadora)
	{
		this.operadora = operadora;
	}

	public Mobilidade getTipo()
	{
		return tipo;
	}

	public void setTipo(Mobilidade tipo)
	{
		this.tipo = tipo;
	}

	@Override
	public String toString()
	{
		return "Telefone{"
			+ "tipo='" + tipo + "'"
			+ ", numero=" + numero
			+ ", operadora='" + operadora + "'"
			+ '}';
	}
}
