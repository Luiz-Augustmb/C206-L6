package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Plataforma newPlataforma = new Plataforma("Nintendo","Guto");


        Jogo[] newJogo = new Jogo[100];
        int opcaoMenu = 0;
        boolean saiMenu = true;
        while (saiMenu){
            System.out.println("Bem vindo!");
            System.out.println("1 - Mostrar as informacoes da plataforma");
            System.out.println("2 - Adicionar um novo jogo");
            System.out.println("3 - Motrar o jogo mais caro e mais barato da plataforma");
            System.out.println("4 - Mostrar quantos jogos da plataforma tem DLC");
            System.out.println("5 - Sair");


            opcaoMenu = sc.nextInt();
            switch (opcaoMenu){
                case 1:
                    newPlataforma.mostraInfo();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Nome do jogo: ");
                    String nomeJogo = sc.nextLine();
                    System.out.print("Genero do jogo: ");
                    String generoJogo = sc.nextLine();
                    System.out.print("Preco do jogo: ");
                    double precoJogo = sc.nextDouble();
                    System.out.print("Possui DLC? (TRUE/FALSE): ");
                    boolean dlcJogo = sc.nextBoolean();
                    sc.nextLine();

                    Jogo jogo = new Jogo(nomeJogo,generoJogo,precoJogo,dlcJogo);
                    newPlataforma.adicionarJogos(jogo);
                    break;

                case 3:
                    newPlataforma.mostraMaisCaroBarato();
                    break;

                case 4:
                    newPlataforma.calculaDlc();
                    break;

                case 5:
                    saiMenu = false;
                    break;
                default:
                    System.out.println("Digite um valor válido");
            }
        }

    }
}