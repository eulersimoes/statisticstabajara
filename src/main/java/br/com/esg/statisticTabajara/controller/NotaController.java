package br.com.esg.statisticTabajara.controller;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;
import br.com.esg.statisticTabajara.domain.model.Estatistica;
import br.com.esg.statisticTabajara.util.nota.EstatisticaUtil;
import br.com.esg.statisticTabajara.util.nota.NotaUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/nota")
@RestController()
public class NotaController {
    @GetMapping("/teste")
    public String teste() {
        return "teste";
    }

    @GetMapping("/cacularEstatisticas/{caminhoArquivo}")
    public Estatistica CalcularEstatisticas(String caminho) {
        List<CandidatoNota> lc = NotaUtil.loadDataFromCsv("");
        return EstatisticaUtil.calcularEstatistica(lc);
    }
}
