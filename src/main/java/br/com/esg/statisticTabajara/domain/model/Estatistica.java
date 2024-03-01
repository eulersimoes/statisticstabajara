package br.com.esg.statisticTabajara.domain.model;

public class Estatistica {

    private Integer numero_registros_total;

    private Double MaiorNotaP1 = 0d;

    private Double MaiorNotaP2 = 0d;

    private Double MaiorNotaP3 = 0d;

    private Double MaiorNotaTotal = 0d;

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

    public Double getMaiorNotaP1() {
        return MaiorNotaP1;
    }

    public void setMaiorNotaP1(Double maiorNotaP1) {
        MaiorNotaP1 = maiorNotaP1;
    }

    public Double getMaiorNotaP2() {
        return MaiorNotaP2;
    }

    public void setMaiorNotaP2(Double maiorNotaP2) {
        MaiorNotaP2 = maiorNotaP2;
    }

    public Double getMaiorNotaP3() {
        return MaiorNotaP3;
    }

    public void setMaiorNotaP3(Double maiorNotaP3) {
        MaiorNotaP3 = maiorNotaP3;
    }

    public Double getMaiorNotaTotal() {
        return MaiorNotaTotal;
    }

    public void setMaiorNotaTotal(Double maiorNotaTotal) {
        MaiorNotaTotal = maiorNotaTotal;
    }
}
