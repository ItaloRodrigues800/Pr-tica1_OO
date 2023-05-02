package Exe2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeFuncionarios = qtdeFuncionarios;
        this.funcionarios = new Funcionario[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}

