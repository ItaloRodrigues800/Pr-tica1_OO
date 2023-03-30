package funcionario;

public class Q2Funcionario extends Funcionario {
    public Q2Funcionario(String nome, double salarioFixo) {
        super(nome, salarioFixo);
    }

    public double calcularProventos() {
        return super.calcularProventos();
    }
}