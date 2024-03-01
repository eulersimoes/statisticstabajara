package br.com.esg.statisticTabajara.util.nota;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;
import java.util.List;

public class EstatisticaUtil {

    public static Estatistica calcularEstatistica(List<CandidatoNota> listaCandidatoNota) {
        Estatistica estatistica = new Estatistica();
        estatistica.setNumero_registros_total(listaCandidatoNota.size());
        CalcularMaioresNotas.CalcularMaioresNotas(listaCandidatoNota, estatistica);
        CalcularMedias.calcularMedias(listaCandidatoNota, estatistica);
        CalcularMedianas.calcularMedianas(listaCandidatoNota, estatistica);
        return estatistica;
    }
}
