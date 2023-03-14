package EXER2;

import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de rendimento mensal (em decimal): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Digite o número de meses do investimento: ");
        int numMeses = scanner.nextInt();

        Rendimento investimento = new Rendimento(investimentoInicial, taxaMensal, numMeses);
        investimento.mostrarRendimento();

        scanner.close();
    }
}
