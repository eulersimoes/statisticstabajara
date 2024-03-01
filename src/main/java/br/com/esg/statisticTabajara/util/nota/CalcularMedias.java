package br.com.esg.statisticTabajara.util.nota;

import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularMedias {

    protected static void calcularMedias(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
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

}
