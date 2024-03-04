package br.com.esg.statisticTabajara.util.nota;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularQuartis {

    protected static void CalcularQuartis(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        List<Double> listaNota = new ArrayList<Double>();
        List<Double> listaQ1 = new ArrayList<Double>();
        List<Double> listaQ2 = new ArrayList<Double>();
        List<Double> listaQ3 = new ArrayList<Double>();
        Double tamanhoLista = Double.valueOf(listaCandidatoNota.size());

        Double posQuartiu2 = 0d;
        Double posQuartiu3 = 0d;
        listaCandidatoNota.stream().forEach((cn) -> {
            listaNota.add(cn.getNotaTotal());
        });
        // Ordenando a lista para iniciar o calculo do quartil
        listaNota.sort(Comparator.naturalOrder());
        // Calculo do primeiro Quartil (0 - 25%):
        // Se o resultado for um inteiro então a posição é o próprio resultado
        // Se o resultado for um decimal divido no meio (ex: 10,50) o valor é a médiados
        // números nas posições 10 e 11
        // Se o resultado for um decimal quebrado (ex: 10,65) então a posição é o
        // decimal mais próximo , no caso 10
        // Formula: k (n+1)/4 -> onde k = quartiu , n = número de observações
        estatistica.setQuartil1Total(CaclularQuartilQ(1, listaNota));
        estatistica.setQuartil2Total(CaclularQuartilQ(2, listaNota));
        estatistica.setQuartil3Total(CaclularQuartilQ(3, listaNota));

        for (Double nota : listaNota) {
            if (nota < estatistica.getQuartil1Total()) {
                estatistica.getListaNotasQuartil1().add(nota);
            } else if (nota < estatistica.getQuartil2Total()) {
                estatistica.getListaNotasQuartil2().add(nota);
            } else {
                estatistica.getListaNotasQuartil3().add(nota);
            }
        }
    }

    private static Double CaclularQuartilQ(Integer quartial, List<Double> listaNota) {
        Double valorq = 0d;
        Double posQuartiu = quartial * ((Double.valueOf(listaNota.size()) + 1) / 4);

        if (VerificarSeNumeroEDecimalUtil.verificarSeEDecimal(posQuartiu) == true) {
            Integer decimalPart = 0;
            try {
                decimalPart = Integer.parseInt(posQuartiu.toString().substring(posQuartiu.toString().indexOf(".") + 1,
                        posQuartiu.toString().indexOf(".") + 3));
            } catch (StringIndexOutOfBoundsException ex) {
                decimalPart = Integer.parseInt(posQuartiu.toString().substring(posQuartiu.toString().indexOf(".") + 1,
                        posQuartiu.toString().indexOf(".") + 2)) * 10;
            }
            if (decimalPart == 50) {
                valorq = (listaNota.get(posQuartiu.intValue()) + listaNota.get(posQuartiu.intValue() + 1)) / 2;
            } else if (decimalPart > 50) {
                valorq = listaNota.get(posQuartiu.intValue() + 1);
            } else {
                valorq = listaNota.get(posQuartiu.intValue() - 1);
            }
        } else {
            valorq = listaNota.get(Integer.parseInt(posQuartiu.toString()));
        }

        return valorq;
    }
}
