package funcionario;

public class Q2FuncionarioCom extends Q2Funcionario {
    private double comissao;

    public Q2FuncionarioCom(String nome, double salarioFixo, double comissao) {
        super(nome, salarioFixo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularProventos() {
        return super.calcularProventos() + (comissao * getVendasRealizadas());
    }

    private int getVendasRealizadas() {
        // Método para obter as vendas realizadas pelo funcionário comissionado
        // Implementação a ser definida de acordo com a necessidade
        return 0;
    }
