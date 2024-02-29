package br.com.esg.statisticTabajara.util;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstatisticaUtil {


    public static Estatistica calcularEstatistica(List<CandidatoNota> listaCandidatoNota) {
        Estatistica estatistica = new Estatistica();
        estatistica.setNumero_registros_total(listaCandidatoNota.size());
        CalcularMaioresNotas(listaCandidatoNota, estatistica);
        calcularMedias(listaCandidatoNota, estatistica);
        calcularMedianas(listaCandidatoNota, estatistica);
        return estatistica;
    }

    private static void CalcularMaioresNotas(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica)
    {
        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            if (candidatoNota.getNotaP1() > estatistica.getMaiorNotaP1()){estatistica.setMaiorNotaP1(candidatoNota.getNotaP1());}
            if (candidatoNota.getNotaP2() > estatistica.getMaiorNotaP2()){estatistica.setMaiorNotaP2(candidatoNota.getNotaP2());}
            if (candidatoNota.getNotaP3() > estatistica.getMaiorNotaP3()){estatistica.setMaiorNotaP3(candidatoNota.getNotaP3());}
            if (candidatoNota.getNotaTotal() > estatistica.getMaiorNotaTotal()){estatistica.setMaiorNotaTotal(candidatoNota.getNotaTotal());}
        }
    }
    private static void calcularMedias(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        Double mediaP1 = 0d;
        Double mediaP2 = 0d;
        Double mediaP3 = 0d;
        Double mediaTotal = 0d;
        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            mediaP1 += candidatoNota.getNotaP1();
            mediaP2 += candidatoNota.getNotaP2();
            mediaP3 += candidatoNota.getNotaP3();
            mediaTotal += candidatoNota.getNotaTotal();
        }
        estatistica.setMediaP1(mediaP1 / listaCandidatoNota.size());
        estatistica.setMediaP2(mediaP2 / listaCandidatoNota.size());
        estatistica.setMediaP3(mediaP3 / listaCandidatoNota.size());
        estatistica.setMediaTotal(mediaTotal / listaCandidatoNota.size());
    }

    private static void calcularMedianas(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        Double medianap1 = 0d;
        Double medianap2 = 0d;
        Double medianap3 = 0d;
        Double medianaTotal = 0d;
        Integer tamanhoLista = listaCandidatoNota.size() - 1;
        //Se a quantidade de elementos por ímpar, a mediana é o (tamanho da lista +1) /2,
        //Se for par a mediana é a média dos números nas posições (tamanho da lista /2) e (tamanho da lista +1) /2
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

    private static Double CalcularMediana(List<Double> listaNotas, Integer tamanhoLista) {
        Double mediana = 0d;
        listaNotas.sort(Comparator.naturalOrder());
        if (tamanhoLista % 2 == 0) {    //par
            mediana = (listaNotas.get(tamanhoLista / 2) + listaNotas.get((tamanhoLista + 1) / 2)) / 2;
        } else { //impar
            mediana = listaNotas.get((tamanhoLista + 1) / 2);
        }
        return mediana;
    }
}
