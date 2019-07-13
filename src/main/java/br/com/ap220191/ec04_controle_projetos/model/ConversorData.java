package br.com.ap220191.ec04_controle_projetos.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData 
{
    public Date converterStringToDate(String date)
    {
    
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try 
        {
            if(!date.equalsIgnoreCase("  /  /    "))
            {
                data = new Date(fmt.parse(date).getTime());
            }
        } 
        catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }
}

