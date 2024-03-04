package br.com.esg.statisticTabajara.util.nota;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularModas {

    public static void CalcularModaTotal(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        Map<Double, Integer> hashModaP1 = new HashMap<Double, Integer>();
        Map<Double, Integer> hashModaP2 = new HashMap<Double, Integer>();
        Map<Double, Integer> hashModaP3 = new HashMap<Double, Integer>();
        Map<Double, Integer> hashModaTotal = new HashMap<Double, Integer>();
        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            hashModaP1.merge(candidatoNota.getNotaP1(), 1, Integer::sum);
            hashModaP2.merge(candidatoNota.getNotaP2(), 1, Integer::sum);
            hashModaP3.merge(candidatoNota.getNotaP3(), 1, Integer::sum);
            hashModaTotal.merge(candidatoNota.getNotaTotal(), 1, Integer::sum);
        }
        int maxCountP1 = Collections.max(hashModaP1.values());
        int maxCountP2 = Collections.max(hashModaP2.values());
        int maxCountP3 = Collections.max(hashModaP3.values());
        int maxCountTotal = Collections.max(hashModaTotal.values());
        if (maxCountP1 == 1) {
            // amodal
            estatistica.setModaP1(0d);
            return;
        }
        for (Map.Entry<Double, Integer> entry : hashModaP1.entrySet()) {
            if (entry.getValue() == maxCountP1) {
                estatistica.setModaP1(entry.getKey());
            }
        }

        if (maxCountP2 == 1) {
            // amodal
            estatistica.setModaP2(0d);
            return;
        }
        for (Map.Entry<Double, Integer> entry : hashModaP2.entrySet()) {
            if (entry.getValue() == maxCountP2) {
                estatistica.setModaP2(entry.getKey());
            }
        }

        if (maxCountP3 == 1) {
            // amodal
            estatistica.setModaP3(0d);
            return;
        }
        for (Map.Entry<Double, Integer> entry : hashModaP3.entrySet()) {
            if (entry.getValue() == maxCountP3) {
                estatistica.setModaP3(entry.getKey());
            }
        }

        if (maxCountTotal == 1) {
            // amodal
            estatistica.setModaTotal(0d);
            return;
        }
        for (Map.Entry<Double, Integer> entry : hashModaTotal.entrySet()) {
            if (entry.getValue() == maxCountTotal) {
                estatistica.setModaTotal(entry.getKey());
            }
        }
    }
}
