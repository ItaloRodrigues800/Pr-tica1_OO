package Exe2;

class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Cleber  machado ", "cleber@gamil.com",
                "7456-9278", "Vendas", 3500.00, "01/08/2016", "598742389");

        Funcionario funcionario2 = new Funcionario("Italo Rodrigues", "italo25brx@gmail.cpm",
                "9876-0932", "Marketing", 5000.00, "02/11/2015", "988957621");

        Empresa empresa = new Empresa("Minha Empresa", "56145676598234");

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);

        empresa.listarFuncionarios();

        System.out.println("Bonificando funcionário 1 em R$ 650,00...");
        funcionario1.bonificar(500.00);
        funcionario1.mostrarDados();

        System.out.println("Demitindo funcionário 2...");
        funcionario2.demitir();
        empresa.listarFuncionarios();
    }
}
