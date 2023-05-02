package Exe2;

public class Main {
    public static void main(String[] args) {
        // Criando 5 objetos da classe Funcionario
        Funcionario f1 = new Funcionario("João", "joao@gmail.com", "123456789", "Vendas", 2000.0, "01/01/2020", "12345678-9");
        Funcionario f2 = new Funcionario("Maria", "maria@gmail.com", "987654321", "TI", 3000.0, "01/02/2020", "98765432-1");
        Funcionario f3 = new Funcionario("Pedro", "pedro@gmail.com", "567891234", "Contabilidade", 2500.0, "01/03/2020", "56789123-4");
        Funcionario f4 = new Funcionario("Ana", "ana@gmail.com", "432156789", "Recursos Humanos", 2800.0, "01/04/2020", "43215678-0");
        Funcionario f5 = new Funcionario("Carlos", "carlos@gmail.com", "345678912", "Marketing", 3500.0, "01/05/2020", "34567891-2");

        // Inserindo os objetos em um array de objetos da classe Funcionario
        Funcionario[] funcionarios = {f1, f2, f3, f4, f5};

        // Imprimindo os atributos de todos os objetos do array
        System.out.println("Funcionário " + (0 + 1) + ":");
        funcionarios[0].mostrarDados();
        System.out.println();
        System.out.println("Funcionário " + (1 + 1) + ":");
        funcionarios[1].mostrarDados();
        System.out.println();
        System.out.println("Funcionário " + (2 + 1) + ":");
        funcionarios[2].mostrarDados();
        System.out.println();
        System.out.println("Funcionário " + (3 + 1) + ":");
        funcionarios[3].mostrarDados();
        System.out.println();
        System.out.println("Funcionário " + (4 + 1) + ":");
        funcionarios[4].mostrarDados();
        System.out.println();
    }
}

