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
		ArrayList<Telefone> telefonesGerenteTI = new ArrayList<>();
		ArrayList<Colaborador> colaboradoresTI = new ArrayList<>();
		ArrayList<Departamento> departamentosTI = new ArrayList<>();
		ArrayList<Projeto> projetosTI = new ArrayList<>();
		ArrayList<AlteracaoSituacao> historia = new ArrayList<>();
		System.out.println("Hello world");
		Endereco end1 = new Endereco();
		Endereco end2 = new Endereco();
		try
		{
			end1 = corr.buscaEndereco("74555470");
			end2 = corr.buscaEndereco("74555320");
		}
		catch(CorreiosException e)
		{
			e.printStackTrace();
		}
		ConversorData conversor = new ConversorData();
		Date dateInicio = conversor.converterData("30/07/2019");
		Date dateConclusao = conversor.converterData("30/08/2020");
		Date mudanca = conversor.converterData("01/08/2019");
		Date nascimento = conversor.converterData("22/11/1965");

		Telefone telefoneTI = new Telefone("12", "Embratel", Mobilidade.FIXO);
		Telefone telefoneGerenteTI =
			new Telefone("13", "Tim", Mobilidade.MOVEL);

		Gerente gerenteTI = new Gerente("Arthur", "XXXXXXXXX", Sexo.MASCULINO,
                                        nascimento, 4000l, "email", end1,
                                        telefonesGerenteTI, departamentosTI);

		Colaborador colaboradorTI =
			new Colaborador("Jose", "CPF", Sexo.MASCULINO, nascimento,
			                4000l, "email", end2, telefonesGerenteTI,
			                departamentosTI);


        Departamento setorTecnologia =
			new Departamento("Tech", "TI", 400000l, "setortech@hotmail.com",
			                 telefoneTI, gerenteTI, colaboradoresTI,
			                 projetosTI);

		Projeto projeto1 = new Projeto("Automacao", dateInicio, dateConclusao,
		                               4000l, "Automatizar", setorTecnologia);
		setorTecnologia.addColaborador(colaboradorTI);

		Projeto projeto2 = new Projeto("Desvio de Verba", dateInicio,
		                               dateConclusao, 5000000l, "Balburdia",
		                               setorTecnologia);
		setorTecnologia.addColaborador(colaboradorTI);

		Projeto projeto3 = new Projeto("Desvio de Verba Profissional",
		                               dateInicio, dateConclusao, 350000l,
		                               "Balburdia", setorTecnologia);
		setorTecnologia.addColaborador(colaboradorTI);

		setorTecnologia.addProjeto(projeto1);
		setorTecnologia.addProjeto(projeto2);
		setorTecnologia.addProjeto(projeto3);
		System.out.println(setorTecnologia.toString());
		System.out.println(projeto1.toString());
		System.out.println(gerenteTI.toString());
		System.out.println(colaboradorTI.toString());
		System.out.println(projeto2.toString());
	}
}
