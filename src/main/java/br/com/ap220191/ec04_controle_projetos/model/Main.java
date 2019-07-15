package br.com.ap220191.ec04_controle_projetos.model;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ConversorData conversor = new ConversorData();
        Date dateInicio = conversor.converterData("30/07/2019");
        Date dateConclusao = conversor.converterData("30/08/2020");
        Date mudanca = conversor.converterData("01/08/2019");
        Date nascimento = conversor.converterData("22/11/1965");
        
        Telefone telefoneTI = new Telefone("12", "Embratel", Mobilidade.FIXO);
        
        //Gerente gerenteTI = new Gerente();
        //OBS: Adicionar um atributo por vez em cada construtor. Quando adicionei tudo de uma vez deu vários erros e não consegui resolver.
        
        Departamento setorTecnologia = new Departamento("Tech", "TI", 4000000l, "setortech@hotmail.com",
                                                        telefoneTI, null, null, null);
        System.out.println(setorTecnologia.toString());
        
        
        //Projeto projeto1 = new Projeto("Automacao", dateInicio, dateConclusao, 4000l, "Automatizar", setorTecnologia);
        //System.out.println(projeto1.toString());
    }
}
