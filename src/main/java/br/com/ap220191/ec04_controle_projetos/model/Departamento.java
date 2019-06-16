package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;
import java.util.ArrayList;

//TODO: implementar métodos
public class Departamento
{
	private String nome;
	private String descricao;
	private long orcamento;
	private String email;
	private Telefone telefone;
	private Gerente gerente;
	private ArrayList<Colaborador> colaboradores;
	private ArrayList<Projeto> projetos;

	public void addColaborador(Colaborador colaborador)
	{
            colaboradores.add(colaborador);
	}

	public boolean removeColaborador(Colaborador colaborador)
	{

	}

	public long getOrcamentoDeProjetos()
	{

	}

	public ArrayList<Projeto> getProjetos(Situacao situacao)
	{

	}

	public boolean podeAdicionar(Projeto projeto)
	{

	}

	public ArrayList<Projeto> getProjetos()
	{
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos)
	{
		this.projetos = projetos;
	}

	public ArrayList<Colaborador> getColaboradores()
	{
		return colaboradores;
	}

	public void setColaboradores(ArrayList<Colaborador> colaboradores)
	{
		this.colaboradores = colaboradores;
	}

	public Gerente getGerente()
	{
		return gerente;
	}

	public void setGerente(Gerente gerente)
	{
		this.gerente = gerente;
	}

	public Telefone getTelefone()
	{
		return telefone;
	}

	public void setTelefone(Telefone telefone)
	{
		this.telefone = telefone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getOrcamento()
	{
		return orcamento;
	}

	public void setOrcamento(long orcamento)
	{
		this.orcamento = orcamento;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
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
		return "Departamento{"
			+ "nome='" + nome + "'"
			+ "descricao='" + descricao + "'"
			+ "orcamento='" + orcamento + "'"
			+ "email='" + email + "'"
			+ "telefone='" + telefone + "'"
			+ "gerente='" + gerente + "'"
			+ "colaboradores='" + colaboradores + "'"
			+ "projetos='" + projetos + "'"
			+ "}";
	}
}
