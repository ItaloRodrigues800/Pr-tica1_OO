public class exe1 {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public class Estoque {
        String nome, int qtdAtual, int qtdMinima;
        nome = nome;
        qtdAtual = qtdAtual;
        qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (qtde <= qtdAtual) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Não é possível dar baixa. Quantidade insuficiente em estoque.");
        }
    }

    public String mostra() {
        return "Nome: " + nome + "\nQuantidade atual: " + qtdAtual + "\nQuantidade mínima: " + qtdMinima;
    }

    public boolean precisaRepor() {
        return qtdAtual < qtdMinima;
    }
}

public class Estoque {
    public static void main(String[] args) {
        Estoque produto = new Estoque("COCA COLA", 55, 20);

        produto.darBaixa(10);
        System.out.println(produto.mostra());
        System.out.println("Precisa repor? " + produto.precisaRepor());

        produto.darBaixa(55);
        System.out.println(produto.mostra());
        System.out.println("Precisa repor? " + produto.precisaRepor());
    }
}