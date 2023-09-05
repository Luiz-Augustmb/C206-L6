package org.example;

public class Jogo {
    
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nomeJogo, String generoJogo, double precoJogo, boolean dlcJogo) {
        this.nome = nomeJogo;
        this.genero = generoJogo;
        this.preco = precoJogo;
        this.dlc = dlcJogo;
    }


    public void mostraInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Jogos da plataforma!");
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Preço: R$" + this.preco);
        if (dlc){
            System.out.println("Possui DLC");
        }else {
            System.out.println("Não possui DLC");
        }
    }
}
