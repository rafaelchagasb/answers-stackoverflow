Você pode tentar assim. 

Na formatação de saída ficou o valor da hora fixo já que você só está tratando minutos e segundos então a hora sempre vai ser 00.


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
