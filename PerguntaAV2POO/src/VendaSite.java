import java.util.ArrayList;

class VendaSite {
    private ArrayList<Ingresso> ingressosEvento = new ArrayList<Ingresso>();
    private int qtdeMax;

    public void insereIngressoVenda(Ingresso ingresso) {
        ingressosEvento.add(ingresso);
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public boolean validaQtdeIngresso() {
        if (ingressosEvento.size() < qtdeMax) {
            return true;
        } else {
            return false;
        }
    }
}