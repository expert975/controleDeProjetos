import br.com.ap220191.ec04_controle_projetos.model.*;

import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Date;

public class Main
{
	public static void main(String args[])
	{
		ApiCorreios corr = ApiCorreios.getInstance();
		//ADICIONA ARRAYLISTS
		ArrayList<Telefone> telefones = new ArrayList<>();
		ArrayList<Colaborador> colaboradores = new ArrayList<>();
		ArrayList<Departamento> departamentos = new ArrayList<>();
		ArrayList<Projeto> projetos = new ArrayList<>();
		ArrayList<AlteracaoSituacao> historia = new ArrayList<>();
		System.out.println("Hello world");
		try
		{
			System.out.println(corr.buscaEndereco("74474101"));
			System.out.println(corr.buscaEndereco("74474201"));
			System.out.println(corr.buscaEndereco("74494201"));
		}
		catch(CorreiosException e)
		{
			e.printStackTrace();
		}
	}
}
