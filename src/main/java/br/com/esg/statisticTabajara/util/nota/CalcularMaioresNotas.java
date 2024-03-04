package br.com.esg.statisticTabajara.util.nota;

import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularMaioresNotas {

    protected static void CalcularMaioresNotas(List<CandidatoNota> listaCandidatoNota, Estatistica estatistica) {
        for (CandidatoNota candidatoNota : listaCandidatoNota) {
            if (estatistica.getMaiorNotaP1() == null
                    || candidatoNota.getNotaP1() > estatistica.getMaiorNotaP1().getNotaP1()) {
                estatistica.setMaiorNotaP1(candidatoNota);
            }
            if (estatistica.getMaiorNotaP2() == null
                    || candidatoNota.getNotaP2() > estatistica.getMaiorNotaP2().getNotaP2()) {
                estatistica.setMaiorNotaP2(candidatoNota);
            }
            if (estatistica.getMaiorNotaP3() == null
                    || candidatoNota.getNotaP3() > estatistica.getMaiorNotaP3().getNotaP3()) {
                estatistica.setMaiorNotaP3(candidatoNota);
            }
            if (estatistica.getMaiorNotaTotal() == null
                    || candidatoNota.getNotaTotal() > estatistica.getMaiorNotaTotal().getNotaTotal()) {
                estatistica.setMaiorNotaTotal(candidatoNota);
            }
        }
    }

}
