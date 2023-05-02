package Exe1;

import java.util.ArrayList;

public class RedeSocial {
    private String nome;
    private String descricao;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da publicação: " + publi.getTextoPublicacao());
            System.out.println("Link da mídia: " + publi.getLinkMidia());
            System.out.println();
        }
    }
}

