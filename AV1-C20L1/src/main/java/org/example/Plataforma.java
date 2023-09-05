package org.example;

public class Plataforma {

    String nome;
    String criador;
    Jogo[] jogos = new Jogo[100];

    public Plataforma(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
    }

    public void mostraInfo(){
        System.out.println("Plataforma: " + this.nome);
        System.out.println("Criador: " + this.criador);
        for (int i = 0; i < jogos.length; i++)
        {
            if(jogos[i]!=null)
            {
                jogos[i].mostraInfo();
            }
        }
    }

    public void adicionarJogos(Jogo jogo){
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato(){
        double maior = Integer.MIN_VALUE;
        String nomeMaior = null;
        double menor = Integer.MAX_VALUE;
        String nomeMenor = null;
        for (int i = 0; i < jogos.length; i++){
            if(jogos[i]!=null) {
                if(jogos[i].preco > maior){
                    maior = jogos[i].preco;
                    nomeMaior = jogos[i].nome;
                }
                if(jogos[i].preco < menor){
                    menor = jogos[i].preco;
                    nomeMenor = jogos[i].nome;
                }
            }
        }
        System.out.println("O jogo mais barato da plataforma e o " + nomeMenor + " e custa R$" + menor);
        System.out.println("O jogo mais caro da plataforma e o " + nomeMaior + " e custa R$" + maior);

    }

    public void calculaDlc(){
        int quantidadeDlc = 0;
        for (int i = 0; i < jogos.length; i++){
            if(jogos[i]!=null)
            {
                if(jogos[i].dlc){
                    quantidadeDlc++;
                }
            }
        }
        System.out.println(quantidadeDlc + " jogos da plataforma possuem DLC");
    }
}
