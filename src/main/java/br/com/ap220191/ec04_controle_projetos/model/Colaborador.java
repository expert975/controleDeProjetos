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

	public Colaborador(String nome, String cpf, Sexo sexo, Date nascimento,
	                   long remuneracao, String email, Endereco endereco,
	                   ArrayList<Telefone> telefones,
	                   ArrayList<Departamento> departamentos)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.remuneracao = remuneracao;
		this.email = email;
		this.endereco = endereco;
		this.telefones = telefones;
		this.departamentos = departamentos;
	}

	public ArrayList<Departamento> getDepartamentos()
	{
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos)
	{
		this.departamentos = departamentos;
	}
        
        public void addDepartamento(Departamento departamento)
        {
            this.departamentos.add(departamento);
        }
        
        public void removeDepartamento(Departamento departamento)
        {
            this.departamentos.remove(departamento);
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

	public void setNascimento(Date nascimento)
	{
		this.nascimento = nascimento;
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
