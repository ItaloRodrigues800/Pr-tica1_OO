package Exe3;

import java.util.ArrayList;

public class ResvistaCientifica {
    private String titulo;
    private long issn;
    private String periodocidade;
    private ArrayList<Edicao> edicoes;

    public ResvistaCientifica(String titulo, long issn, String periodocidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodocidade = periodocidade;
        this.edicoes = new ArrayList<>();
    }

    public void adicionarEdicao(Edicao edicao) {
        this.edicoes.add(edicao);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodocidade() {
        return periodocidade;
    }

    public void setPeriodocidade(String periodocidade) {
        this.periodocidade = periodocidade;
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(ArrayList<Edicao> edicoes) {
        this.edicoes = edicoes;
    }
}
