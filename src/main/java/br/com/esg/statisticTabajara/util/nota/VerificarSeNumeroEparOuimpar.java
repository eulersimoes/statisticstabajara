package br.com.esg.statisticTabajara.util.nota;

public class VerificarSeNumeroEparOuimpar {

    
    public static Boolean verificarSeEDecimal(Double valor) 
    {
        return (valor % 1 != 0) ? true : false;
    }

}
