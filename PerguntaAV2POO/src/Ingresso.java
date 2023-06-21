class Ingresso {
    private Evento evento;
    private double valor;
    private int qtdeMax;
    private String tipoIngresso;

    public Ingresso(Evento evento, double valor, int qtdeMax) {
        this.evento = evento;
        this.valor = valor;
        this.qtdeMax = qtdeMax;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }
}
