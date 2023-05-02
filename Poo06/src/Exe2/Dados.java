package Exe2;

import static java.lang.System.out;

public class Dados {
    private String nome;
    private String email;
    private double telefone;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private String ativo;

    public Dados() {
    }


    public void mostrarDados() {
        out.println("Nome: " + this.nome);
        out.println("E-mail: " + this.email);
        out.println("Telefone: " + this.telefone);
        out.println("Departamento: " + this.departamento);
        out.println("Salário: " + this.salario);
        out.println("Data de entrada: " + this.dataEntrada);
        out.println("RG: " + this.rg);
        out.println("Ativo na empresa: " + (this.ativo ? "Sim" : "Não"));
    }

}
