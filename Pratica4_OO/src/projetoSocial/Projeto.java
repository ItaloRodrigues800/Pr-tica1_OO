package projetoSocial;

import java.util.Date;

class Projeto {
    private String nomProjeto;
    private String descricao;
    private Date datainicio;
    private Date datafim;
    private String nomProjeto;
    private String descricao;
    private Date datainicio;
    private Date datafim;


    public Projeto(String nomProjeto, String descricao, Date datainicio, Date datafim) {
        this.nomProjeto = nomProjeto;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomProjeto() {
        return nomProjeto;
    }

    public void setNomProjeto(String nomProjeto) {
        this.nomProjeto = nomProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public Projeto(String nomProjeto, String descricao, Date datainicio, Date datafim) {
        this.nomProjeto = nomProjeto;
        this.descricao = descricao;
        this.datainicio = datainicio;

    }
}


