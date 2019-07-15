package br.com.ap220191.ec04_controle_projetos.model;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // TODOS atributos individuais tem que ser instanciados primeiro, mesmo que não sejam inicializados;
        //OBS: Adicionar departamentos dá erro!
        ConversorData conversor = new ConversorData();
        Date dateInicio = conversor.converterData("30/07/2019");
        Date dateConclusao = conversor.converterData("30/08/2020");
        Date mudanca = conversor.converterData("01/08/2019");
        Date nascimento = conversor.converterData("22/11/1965");
        
        Telefone telefoneTI = new Telefone("12", "Embratel", Mobilidade.FIXO);
        Telefone telefoneGerenteTI = new Telefone("13", "Tim", Mobilidade.MOVEL);
        
        ArrayList<Departamento> departamentosTI = new ArrayList<>();
        ArrayList<Projeto> projetosTI = new ArrayList<>();
        ArrayList<Telefone> telefonesGerenteTI = new ArrayList<>();
        ArrayList<Colaborador> colaboradoresTI = new ArrayList<>();
                
        Gerente gerenteTI = new Gerente("Arthur", "XXXXXXXXX", Sexo.MASCULINO, 
                                        nascimento, 4000l, "email", null, 
                                        telefonesGerenteTI, departamentosTI);
        
        Colaborador colaboradorTI = new Colaborador("Jose", "CPF", Sexo.MASCULINO, 
                                            nascimento, 4000l, "email", null, 
                                            telefonesGerenteTI, departamentosTI);
        
        
        Departamento setorTecnologia = new Departamento("Tech", "TI", 4000000l, 
                                    "setortech@hotmail.com",telefoneTI, gerenteTI, 
                                    colaboradoresTI, projetosTI);            
        
        Projeto projeto1 = new Projeto("Automacao", dateInicio, dateConclusao, 4000l, "Automatizar", setorTecnologia);
        Projeto projeto2 = new Projeto("Desvio de Verba", dateInicio, dateConclusao, 5000000l, "Balburdia", setorTecnologia);        
        projeto1.mudarSituacao(Situacao.ATRASADO, mudanca, colaboradorTI, null);
        setorTecnologia.addProjeto(projeto1);
        setorTecnologia.addProjeto(projeto2); //Não adiciona o projeto2 pq excede a verba
        System.out.println(setorTecnologia.toString());
        //System.out.println(projeto1.toString());
    }
}
