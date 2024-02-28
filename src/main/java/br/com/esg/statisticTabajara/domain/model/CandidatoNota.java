package br.com.esg.statisticTabajara.domain.model;

public class CandidatoNota {

    private String nome;
    private String inscricao;
    private Double notaP1;
    private Double notaP2;
    private Double notaP3;
    private Double notaTotal;

    public CandidatoNota() {
    }

    ;

    public CandidatoNota(String inscricao, String nome, Double notaP1, Double notaP2, Double notaP3) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaP3 = notaP3;
    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public Double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(Double notaP1) {
        this.notaP1 = notaP1;
    }

    public Double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(Double notaP2) {
        this.notaP2 = notaP2;
    }

    public Double getNotaP3() {
        return notaP3;
    }

    public void setNotaP3(Double notaP3) {
        this.notaP3 = notaP3;
    }

    public Double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(Double notaTotal) {
        this.notaTotal = notaTotal;
    }
}
