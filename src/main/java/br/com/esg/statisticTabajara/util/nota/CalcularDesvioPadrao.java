package br.com.esg.statisticTabajara.util.nota;

import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularDesvioPadrao {

    public static void CalcularDesvioPadrao(List<CandidatoNota> listaNotas, Estatistica estatistica) {
        estatistica.setDesvioPadrao(Math.sqrt(estatistica.getVariancia()));
    }
}
