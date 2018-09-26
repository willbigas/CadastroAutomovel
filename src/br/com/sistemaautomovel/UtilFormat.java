package br.com.sistemaautomovel;

/**
 *
 * @author William
 */
public class UtilFormat {

    /**
     *
     * Convertendo Strings para Valores
     */
    
    public static Integer StringParaInteiro(String texto) throws Exception {

        Integer valorInteiro = Integer.valueOf(texto);
        return valorInteiro;
    }

    public static Double StringParaDecimal(String texto) throws Exception {

        Double valorInteiro = Double.valueOf(texto);
        return valorInteiro;
    }

    /**
     *
     * Convertendo Valores para Strings
     */
    
    public static String decimalParaSring(Double valorDecimal) throws Exception {

        String texto = valorDecimal.toString();
        return texto;
    }

    public static String inteiroParaSring(Integer valorInteiro) throws Exception {

        String texto = valorInteiro.toString();
        return texto;
    }

    
    
     /**
     *
     * Convertendo Tipos de Valores
     */
    public static Integer decimalParaInteiro(Double valorDecimal) throws Exception {

        Integer numeroInteiro = valorDecimal.intValue();
        return numeroInteiro;
    }

    public static Double inteiroParaDecimal(Integer valorInteiro) throws Exception {

        Double numeroDecimal = valorInteiro.doubleValue();
        return numeroDecimal;
    }
}
