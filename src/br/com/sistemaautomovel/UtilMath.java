package br.com.sistemaautomovel;

/**
 *
 * @author William
 */
public class UtilMath {

    /**
     *
     * Operadores Aritmeticos Simples [+ - * /]
     */
    public static Double somarNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double somaNumero = numeroA + numeroB;
        return somaNumero;
    }

    public static Double subtrairNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double somaNumero = numeroA - numeroB;
        return somaNumero;
    }

    public static Double multiplicarNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double somaNumero = numeroA * numeroB;
        return somaNumero;
    }

    public static Double dividirNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double somaNumero = numeroA / numeroB;
        return somaNumero;
    }

    /**
     *
     * Calculo de Medias de Decimais e Inteiros.
     */
    public static Double mediaDeDoisDecimais(Double numeroA, Double numeroB) throws Exception {

        Double media = (numeroA + numeroB) / 2;
        return media;
    }

    public static Integer mediaDeDoisInteiros(Integer numeroA, Integer numeroB) throws Exception {

        Integer media = (numeroA + numeroB) / 2;
        return media;
    }

    public static Double mediaDeTresDecimais(Double numeroA, Double numeroB, Double numeroC) throws Exception {

        Double media = (numeroA + numeroB + numeroC) / 3;
        return media;
    }

    public static Integer mediaDeTresInteiros(Integer numeroA, Integer numeroB, Integer numeroC) throws Exception {

        Integer media = (numeroA + numeroB + numeroC) / 3;
        return media;
    }

    /**
     *
     * Maior e menor numero.
     */
    public static Double maiorNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double maiorNumero = null;
        if (numeroA > numeroB) {
            maiorNumero = numeroA;
        }
        if (numeroB > numeroA) {
            maiorNumero = numeroB;
        }
        if (numeroA == numeroB) {
            maiorNumero = 0.0;
        }

        return maiorNumero;
    }

    public static Integer maiorNumeroInteiro(Integer numeroA, Integer numeroB) throws Exception {

        Integer maiorNumero = null;
        if (numeroA > numeroB) {
            maiorNumero = numeroA;
        }
        if (numeroB > numeroA) {
            maiorNumero = numeroB;
        }
        if (numeroA == numeroB) {
            maiorNumero = 0;
        }

        return maiorNumero;
    }

    public static Double menorNumeroDecimal(Double numeroA, Double numeroB) throws Exception {

        Double menorNumero = null;
        if (numeroA < numeroB) {
            menorNumero = numeroA;
        }
        if (numeroB < numeroA) {
            menorNumero = numeroB;
        }
        if (numeroA == numeroB) {
            menorNumero = 0.0;
        }

        return menorNumero;

    }

    public static Integer menorNumeroInteiro(Integer numeroA, Integer numeroB) throws Exception {

        Integer menorNumero = null;
        if (numeroA < numeroB) {
            menorNumero = numeroA;
        }
        if (numeroB < numeroA) {
            menorNumero = numeroB;
        }
        if (numeroA == numeroB) {
            menorNumero = 0;
        }

        return menorNumero;

    }

    /**
     *
     * Calculo de Porcentagem
     */
    public static Double calcularPorcentagemDecimal(Double valorCalculo, Double valorPorcentagem) throws Exception {
        Double valorTotal = (valorCalculo * valorPorcentagem) / 100;

        return valorTotal;
    }

    public static Integer calcularPorcentagemInteiro(Integer valorCalculo, Integer valorPorcentagem) throws Exception {
        Integer valorTotal = (valorCalculo * valorPorcentagem) / 100;

        return valorTotal;
    }
}
