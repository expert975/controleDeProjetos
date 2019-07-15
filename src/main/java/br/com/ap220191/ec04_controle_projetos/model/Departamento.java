package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;
import java.util.ArrayList;

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

	public Departamento(String nome, String descricao, long orcamento,
	                    String email, Telefone telefone, Gerente gerente,
	                    ArrayList<Colaborador> colaboradores,
	                    ArrayList<Projeto> projetos)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.orcamento = orcamento;
		this.email = email;
		this.telefone = telefone;
		this.gerente = gerente;
		this.colaboradores = colaboradores;
		this.projetos = projetos;
	}

	public void addColaborador(Colaborador colaborador)
	{
		colaboradores.add(colaborador);
	}

	public void removeColaborador(Colaborador colaborador)
	{
		colaboradores.remove(colaborador);
	}

	public long getOrcamentoDeProjetos()
	{
		long orcamentoProjetos = 0;
		for(Projeto projeto : projetos)
		{
			orcamentoProjetos += projeto.getOrcamento();
		}
		return orcamentoProjetos;
	}

	public ArrayList<Projeto> getProjetos(Situacao situacao)
	{
		ArrayList<Projeto> projetosRetorno = new ArrayList<>();
		for(Projeto projeto : projetos)
		{
			if(projeto.getSituacao().equals(situacao))
			{
				projetosRetorno.add(projeto);
			}
		}
		return projetosRetorno;
	}

	public boolean podeAdicionar(Projeto projeto)
	{
		return projeto.getOrcamento()
			<= this.orcamento - getOrcamentoDeProjetos();
	}
        
        public void addProjeto(Projeto projeto)
	{
		if(podeAdicionar(projeto)) this.projetos.add(projeto);
	}

	public void removeProjeto(Projeto projeto)
	{
		projetos.remove(projeto);
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
			+ "\n\tnome='" + nome + "'"
			+ "\n\tdescricao='" + descricao + "'"
			+ "\n\torcamento='" + orcamento + "'"
			+ "\n\temail='" + email + "'"
			+ "\n\ttelefone='" + telefone.getNumero() + "'"
			+ "\n\tgerente='" + gerente.getNome() + "'"
			+ "\n\tcolaboradores='" + colaboradores + "'"
			+ "\n\tprojetos='" + projetos + "'"
			+ "}";
	}
}
