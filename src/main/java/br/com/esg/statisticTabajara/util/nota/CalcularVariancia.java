package br.com.esg.statisticTabajara.util.nota;
/*A variância de um conjunto de dados (amostra ou população) é uma
medida de “VARIABILIDADE ABSOLUTA”. Ela mede a variabilidade do
conjunto em termos de desvios quadrados em relação à média
aritmética. É uma quantidade sempre não negativa e expressa em
unidades quadradas do conjunto de dados, sendo de difícil
interpretação.*/

import java.util.List;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;

public class CalcularVariancia {

    public static void CalcularVarianciaTotal(List<CandidatoNota> listaNotas, Estatistica estatistica) {
        // 1 - Calcular a média
        Double media = 0d;
        Double variancia = 0d;
        for (CandidatoNota candidatoNota : listaNotas) {
            media += candidatoNota.getNotaTotal();
        }
        media = (media / listaNotas.size());

        // 2º passo: calcular a variância
        // Agora, substituímos a média (reto X em moldura superior) e os valores do
        // conjunto (Xn) na fórmula de variância.
        for (CandidatoNota candidatoNota : listaNotas) {
            variancia += Math.pow((candidatoNota.getNotaTotal() - media), 2);
        }
        variancia = variancia / listaNotas.size();
        estatistica.setVariancia(variancia);

    }

}
