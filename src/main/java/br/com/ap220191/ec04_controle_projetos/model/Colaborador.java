package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;
import java.util.ArrayList;

public class Colaborador
{
	private String nome;
	private String cpf;
	private Sexo sexo;
	private Date nascimento;
	private long remuneracao;
	private String email;
	private Endereco endereco;
	private ArrayList<Telefone> telefones;
	private ArrayList<Departamento> departamentos;
        private ConversorData conversor = new ConversorData();

	public ArrayList<Departamento> getDepartamentos()
	{
		return departamentos;
	}
        
        public void setDepartamentos(ArrayList<Departamento> departamentos)
	{
		this.departamentos = departamentos;
	}
        
        public void setDepartamento(Departamento departamento)
        {
                departamentos.add(departamento);
        }
        
	public ArrayList<Telefone> getTelefones()
	{
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones)
	{
		this.telefones = telefones;
	}

	public Endereco getEndereco()
	{
		return endereco;
	}

	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getRemuneracao()
	{
		return remuneracao;
	}

	public void setRemuneracao(long remuneracao)
	{
		this.remuneracao = remuneracao;
	}

	public Date getNascimento()
	{
		return nascimento;
	}

	public void setNascimento(String nascimento)
	{
		this.nascimento = conversor.converterStringToDate(nascimento);
	}

	public Sexo getSexo()
	{
		return sexo;
	}

	public void setSexo(Sexo sexo)
	{
		this.sexo = sexo;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
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
		return "Colaborador{"
			+ "nome='" + nome + "'"
			+ "cpf='" + cpf + "'"
			+ "sexo='" + sexo + "'"
			+ "nascimento='" + nascimento + "'"
			+ "remuneracao='" + remuneracao + "'"
			+ "email='" + email + "'"
			+ "endereco='" + endereco + "'"
			+ "telefones='" + telefones + "'"
			+ "departamentos='" + departamentos + "'"
			+ "}";
	}
}
