package projetoSocial;

class DistribuicaoAlimento extends Projeto {
    private Alimento alimento;

    public DistribuicaoAlimento(String nomProjeto, String descricao, Date datainicio, Date datafim, Alimento alimento) {
        super(nomProjeto, descricao, datainicio, datafim);
        this.alimento = alimento;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public boolean validaProjeto() {
        return getDatafim() == null;
    }

    public String imprimeProjeto() {
        return "Projeto: " + getNomProjeto() + "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDatainicio() + "\nData de Fim: " + getDatafim() +
                "\nAlimento: " + alimento.getDescAlimento() + "\nQuantidade: " + alimento.getQtde();
    }
}

