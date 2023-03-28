public class Q2FuncionarioProd extends Q2Funcionario {
    private double valorPorUnidade;

    public Q2FuncionarioProd(String nome, double salarioFixo, double valorPorUnidade) {
        super(nome, salarioFixo);
        this.valorPorUnidade = valorPorUnidade;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    public double calcularProventos() {
        return super.calcularProventos() + (getValorPorUnidade() * getProducao());
    }

    private int getProducao() {
        // Método para obter a produção do funcionário
        // Implementação a ser definida de acordo com a necessidade
        return 0;
    }
}