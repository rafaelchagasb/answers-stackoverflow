package br.com.rafaelchagasb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
	
	public static void main(String[] args) {
		
	    String input = "1:25.684";

	    DateFormat formatacaoEntrada = new SimpleDateFormat("mm:ss.SSS");

	    DateFormat formatacaoSaida = new SimpleDateFormat("00:mm:ss.SSS");

	    String horaConvertida = null;

	    try {

	        Date entradaFormatadaComoData = formatacaoEntrada.parse(input);

	        horaConvertida = formatacaoSaida.format(entradaFormatadaComoData);

	        System.out.println(horaConvertida);

	    } catch (ParseException pe) {
	        pe.printStackTrace();
	    }
		
	}
}
