import br.com.ap220191.ec04_controle_projetos.model.*;

import java.lang.Thread;
import java.lang.InterruptedException;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("Hello world");
		ApiCorreios corr = ApiCorreios.getInstance();
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
