package projetoSocial;

class TrabalhoVoluntario extends Projeto {
    private int duracao;

    public TrabalhoVoluntario(String nomProjeto, String descricao, Date datainicio, Date datafim, int duracao) {
        super(nomProjeto, descricao, datainicio, datafim);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean validaProjeto() {
        return duracao > 2;
    }

