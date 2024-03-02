package br.com.esg.statisticTabajara.util.nota;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularMedianas {

    protected static void calcularMedianas(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        Double medianap1 = 0d;
        Double medianap2 = 0d;
        Double medianap3 = 0d;
        Double medianaTotal = 0d;
        Integer tamanhoLista = listaCandidatoNota.size() - 1;
        // Se a quantidade de elementos por ímpar, a mediana é o (tamanho da lista +1)
        // /2,
        // Se for par a mediana é a média dos números nas posições (tamanho da lista /2)
        // e (tamanho da lista +1) /2
        List<Double> listaNotasP1 = new ArrayList<Double>();
        List<Double> listaNotasP2 = new ArrayList<Double>();
        List<Double> listaNotasP3 = new ArrayList<Double>();
        List<Double> listaNotasPTotal = new ArrayList<Double>();

        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            listaNotasP1.add(candidatoNota.getNotaP1());
            listaNotasP2.add(candidatoNota.getNotaP2());
            listaNotasP3.add(candidatoNota.getNotaP3());
            listaNotasPTotal.add(candidatoNota.getNotaTotal());
        }

        estatistica.setMedianaP1(CalcularMediana(listaNotasP1, tamanhoLista));
        estatistica.setMedianaP2(CalcularMediana(listaNotasP2, tamanhoLista));
        estatistica.setMedianaP3(CalcularMediana(listaNotasP3, tamanhoLista));
        estatistica.setMedianaTotal(CalcularMediana(listaNotasPTotal, tamanhoLista));
    }

    protected static Double CalcularMediana(List<Double> listaNotas, Integer tamanhoLista) {
        Double mediana = 0d;
        listaNotas.sort(Comparator.naturalOrder());
        if (tamanhoLista % 2 == 0) { // par
            mediana = (listaNotas.get(tamanhoLista / 2) + listaNotas.get((tamanhoLista + 1) / 2)) / 2;
        } else { // impar
            mediana = listaNotas.get((tamanhoLista + 1) / 2);
        }
        return mediana;
    }

}
