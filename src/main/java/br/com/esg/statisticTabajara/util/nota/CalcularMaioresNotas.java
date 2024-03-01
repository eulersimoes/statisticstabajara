package br.com.esg.statisticTabajara.util.nota;

import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularMaioresNotas {

    protected static void CalcularMaioresNotas(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            if (candidatoNota.getNotaP1() > estatistica.getMaiorNotaP1()) {
                estatistica.setMaiorNotaP1(candidatoNota.getNotaP1());
            }
            if (candidatoNota.getNotaP2() > estatistica.getMaiorNotaP2()) {
                estatistica.setMaiorNotaP2(candidatoNota.getNotaP2());
            }
            if (candidatoNota.getNotaP3() > estatistica.getMaiorNotaP3()) {
                estatistica.setMaiorNotaP3(candidatoNota.getNotaP3());
            }
            if (candidatoNota.getNotaTotal() > estatistica.getMaiorNotaTotal()) {
                estatistica.setMaiorNotaTotal(candidatoNota.getNotaTotal());
            }
        }
    }

}
