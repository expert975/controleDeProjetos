package br.com.ap220191.ec04_controle_projetos.model;

import java.util.Date;
import java.util.ArrayList;

public class Gerente extends Colaborador
{
	public Gerente(String nome, String cpf, Sexo sexo, Date nascimento,
	               long remuneracao, String email, Endereco endereco,
	               ArrayList<Telefone> telefones,
	               ArrayList<Departamento> departamentos)
	{
		super(nome, cpf, sexo, nascimento, remuneracao, email, endereco,
	         telefones, departamentos);
	}

	@Override
	public String toString()
	{
		return "Gerente{" + super.toString() + '}';
	}
}
