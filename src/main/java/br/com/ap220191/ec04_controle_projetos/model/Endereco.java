package br.com.ap220191.ec04_controle_projetos.model;

public class Endereco
{
	private String tipo;
	private String nome;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public String getComplemento()
	{
		return complemento;
	}

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}

	public String getBairro()
	{
		return bairro;
	}

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public String getCep()
	{
		return cep;
	}

	public void setCep(String cep)
	{
		this.cep = cep;
	}

	public String getCidade()
	{
		return cidade;
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	@Override
	public String toString()
	{
		return "Endereco{"
			+ "tipo='" + tipo + "'"
			+ ", nome='" + nome + "'"
			+ ", numero='" + numero + "'"
			+ ", complemento='" + complemento + "'"
			+ ", bairro='" + bairro + "'"
			+ ", cep='" + cep + "'"
			+ ", cidade='" + cidade + "'"
			+ ", estado='" + estado + "'"
			+ '}';
	}
}
