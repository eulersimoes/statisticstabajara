package br.com.esg.statisticTabajara.domain.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Estatistica {

    private Integer numero_registros_total;

    private CandidatoNota MaiorNotaP1;

    private CandidatoNota MaiorNotaP2;

    private CandidatoNota MaiorNotaP3;

    private CandidatoNota MaiorNotaTotal;

    private Double variancia;

    private Double desvioPadrao;

    private Double mediaP1;
    private Double mediaP2;
    private Double mediaP3;

    private Double mediaTotal;
    private Double medianaP1;
    private Double medianaP2;
    private Double medianaP3;

    private Double medianaTotal;
    private Double modaP1;
    private Double modaP2;
    private Double modaP3;
    private Double modaTotal;

    private Double Quartil1Total;
    private Double Quartil2Total;
    private Double Quartil3Total;

    private List<Double> listaNotasTotal = new ArrayList<Double>();

    private List<Double> listaNotasQuartil1 = new ArrayList<Double>();
    private List<Double> listaNotasQuartil2 = new ArrayList<Double>();
    private List<Double> listaNotasQuartil3 = new ArrayList<Double>();

    public Double getDesvioPadrao() {
        return this.desvioPadrao;
    }

    public void setDesvioPadrao(Double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public Double getVariancia() {
        return this.variancia;
    }

    public void setVariancia(Double variancia) {
        this.variancia = variancia;
    }

    public List<Double> getListaNotasQuartil1() {
        return this.listaNotasQuartil1;
    }

    public void setListaNotasQuartil1(List<Double> listaNotasQuartil1) {
        this.listaNotasQuartil1 = listaNotasQuartil1;
    }

    public List<Double> getListaNotasQuartil2() {
        return this.listaNotasQuartil2;
    }

    public void setListaNotasQuartil2(List<Double> listaNotasQuartil2) {
        this.listaNotasQuartil2 = listaNotasQuartil2;
    }

    public List<Double> getListaNotasQuartil3() {
        return this.listaNotasQuartil3;
    }

    public void setListaNotasQuartil3(List<Double> listaNotasQuartil3) {
        this.listaNotasQuartil3 = listaNotasQuartil3;
    }

    public List<Double> getListaNotasTotal() {
        return this.listaNotasTotal;
    }

    public void setListaNotasTotal(List<Double> listaNotasTotal) {
        this.listaNotasTotal = listaNotasTotal;
    }

    public Double getQuartil1Total() {
        return this.Quartil1Total;
    }

    public void setQuartil1Total(Double Quartil1Total) {
        this.Quartil1Total = Quartil1Total;
    }

    public Double getQuartil2Total() {
        return this.Quartil2Total;
    }

    public void setQuartil2Total(Double Quartil2Total) {
        this.Quartil2Total = Quartil2Total;
    }

    public Double getQuartil3Total() {
        return this.Quartil3Total;
    }

    public void setQuartil3Total(Double Quartil3Total) {
        this.Quartil3Total = Quartil3Total;
    }

    public Double getMediaP1() {
        return mediaP1;
    }

    public void setMediaP1(Double mediaP1) {
        this.mediaP1 = (mediaP1);
    }

    public Double getMediaP2() {
        return mediaP2;
    }

    public void setMediaP2(Double mediaP2) {
        this.mediaP2 = (mediaP2);
    }

    public Double getMediaP3() {
        return mediaP3;
    }

    public void setMediaP3(Double mediaP3) {
        this.mediaP3 = (mediaP3);
    }

    public Double getMediaTotal() {
        return mediaTotal;
    }

    public void setMediaTotal(Double mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    public Double getMedianaP1() {
        return medianaP1;
    }

    public void setMedianaP1(Double medianaP1) {
        this.medianaP1 = medianaP1;
    }

    public Double getMedianaP2() {
        return medianaP2;
    }

    public void setMedianaP2(Double medianaP2) {
        this.medianaP2 = medianaP2;
    }

    public Double getMedianaP3() {
        return medianaP3;
    }

    public void setMedianaP3(Double medianaP3) {
        this.medianaP3 = medianaP3;
    }

    public Double getMedianaTotal() {
        return medianaTotal;
    }

    public void setMedianaTotal(Double medianaTotal) {
        this.medianaTotal = medianaTotal;
    }

    public Double getModaP1() {
        return modaP1;
    }

    public void setModaP1(Double modaP1) {
        this.modaP1 = modaP1;
    }

    public Double getModaP2() {
        return modaP2;
    }

    public void setModaP2(Double modaP2) {
        this.modaP2 = modaP2;
    }

    public Double getModaP3() {
        return modaP3;
    }

    public void setModaP3(Double modaP3) {
        this.modaP3 = modaP3;
    }

    public Double getModaTotal() {
        return modaTotal;
    }

    public void setModaTotal(Double modaTotal) {
        this.modaTotal = modaTotal;
    }

    public Integer getNumero_registros_total() {
        return numero_registros_total;
    }

    public void setNumero_registros_total(Integer numero_registros_total) {
        this.numero_registros_total = numero_registros_total;
    }

    public CandidatoNota getMaiorNotaP1() {
        return MaiorNotaP1;
    }

    public void setMaiorNotaP1(CandidatoNota maiorNotaP1) {
        MaiorNotaP1 = maiorNotaP1;
    }

    public CandidatoNota getMaiorNotaP2() {
        return MaiorNotaP2;
    }

    public void setMaiorNotaP2(CandidatoNota maiorNotaP2) {
        MaiorNotaP2 = maiorNotaP2;
    }

    public CandidatoNota getMaiorNotaP3() {
        return MaiorNotaP3;
    }

    public void setMaiorNotaP3(CandidatoNota maiorNotaP3) {
        MaiorNotaP3 = maiorNotaP3;
    }

    public CandidatoNota getMaiorNotaTotal() {
        return MaiorNotaTotal;
    }

    public void setMaiorNotaTotal(CandidatoNota maiorNotaTotal) {
        MaiorNotaTotal = maiorNotaTotal;
    }
}
