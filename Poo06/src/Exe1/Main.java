package Exe1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome da Rede Social:");
        String descricao = JOptionPane.showInputDialog("Digite a descrição da Rede Social:");
        RedeSocial redeSocial = new RedeSocial(nome, descricao);


        Publicacao publi1 = new Publicacao("01/05/2023", "Primeira publicação", "www.midia.com");
        redeSocial.inserePublicacao(publi1);

        Publicacao publi2 = new Publicacao("02/05/2023", "Segunda publicação", "");
        publi2.setTextoPublicacao("Texto da segunda publicação");
        redeSocial.inserePublicacao(publi2);


        redeSocial.imprimePublicacoes();
    }
}

