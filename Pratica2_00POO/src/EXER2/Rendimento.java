package EXER2;
import java.util.Scanner;
    public class Rendimento {
        private double investimentoInicial;
        private double taxaMensal;
        private int numMeses;

        public Rendimento(double investimentoInicial, double taxaMensal, int numMeses) {
            investimentoInicial = investimentoInicial;
            taxaMensal = taxaMensal;
            numMeses = numMeses;
        }

        public double calcularRendimento() {
            double rendimento = investimentoInicial * Math.pow(1 + taxaMensal, numMeses);
            return rendimento - investimentoInicial;
        }

        public void mostrarRendimento() {
            double rendimento = calcularRendimento();
            System.out.printf("O rendimento do investimento é de R$%.2f.\n", rendimento);
        }
    }

    }
