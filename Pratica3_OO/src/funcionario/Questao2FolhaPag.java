package funcionario;

import java.util.ArrayList;

public class Questao2FolhaPag {
    private String nome;
    private double salarioFixo;
    private double comissao;
    private double producao;
    public Funcionario (String nome, double salarioFixo, double comissao, double producao) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.comissao = comissao;
        this.producao = producao;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public double getComissao() {
        return comissao;
    }
    public double getProducao() {
        return producao;
    }

    public double calcularSalario() {
        return salarioFixo + (comissao * vendasRealizadas()) + (producao * valorPorUnidadeProduzida());
    }
    private double vendasRealizadas() {
        return 0;
    }

    private double valorPorUnidadeProduzida() {
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario1 = new Funcionario("João", 2000.0, 0.05, 2.5);
        funcionarios.add(funcionario1);
        Funcionario funcionario2 = new Funcionario("Maria", 1500.0, 0.0, 0.0);
        funcionarios.add(funcionario2);
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário fixo: R$" + funcionario.getSalarioFixo());
            System.out.println("Comissão: R$" + (funcionario.getComissao() * funcionario.vendasRealizadas()));
            System.out.println("Produtividade: R$" + (funcionario.getProducao() * funcionario.valorPorUnidadeProduzida()));
            System.out.println("Total de proventos: R$" + funcionario.calcularSalario());
            System.out.println();
        }
    }
}
public class Funcionario {
    private String nome;
    private double salarioFixo;

    public Funcionario(String nome, double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularProventos() {
        return salarioFixo;
    }
}




public class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, double salarioFixo, double comissao) {
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
