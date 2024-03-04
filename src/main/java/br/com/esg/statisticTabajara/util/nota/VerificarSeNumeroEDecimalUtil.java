package br.com.esg.statisticTabajara.util.nota;

public class VerificarSeNumeroEDecimalUtil {

    public static Boolean verificarSeEDecimal(Double valor) {
        return (valor % 1 != 0) ? true : false;
    }

}
