package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in); //Configurando entrada de dados
        Boolean flag = true; //Flag para o menu
        Arquivo arquivo = new Arquivo(); //Criando o arquivo
        ArrayList<Livro> livrosArray = new ArrayList<>(); //Array de Produtos

        while (flag) {
            //Configurando as opções do menu
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar um novo Livro ");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar livros em ordem crescente de preço");
            System.out.println("4 - Ordenar livros em ordem decrescente de preço");
            System.out.println("5 - Sair do Menu");

            //Operador do Menu
            int op = valorTeclado.nextInt();
            switch (op) {

                case 1: //Adicionando um novo livro no arquivo
                    System.out.println("--- Adicionando Produto ---");

                    //Entrando com o nome do livro
                    System.out.print("Entre com o nome do Livro: ");
                    valorTeclado.nextLine();
                    String nome = valorTeclado.nextLine();

                    System.out.print("Entre com o nome do autor: ");
                    String autor = valorTeclado.nextLine();
                    try {

                        System.out.print("Entre com a editora: ");
                        String editora = valorTeclado.nextLine();

                        //Verifiando se a editora é valida
                        if (editora.equals("Leya") || editora.equals("Arqueiro") || editora.equals("Rocco")) {
                            //Se for válido, continua o código normalmente
                        } else {
                            throw new InfoInvalidaException("Editora inválida!");
                            //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                        }

                        try {
                            //Entrando com o gênero do Produto
                            System.out.print("Entre com a quantidade de página do livro: ");
                            int qtdPaginas = valorTeclado.nextInt();

                            if (qtdPaginas > 0) {
                                //Se for válido, continua o código normalmente
                            } else {
                                throw new InfoInvalidaException("Livro tem que ter um número de páginas maior que 0!");
                                //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                            }

                            //Criando o Produto, escrevendo no arquivo e adicionando ao Array
                            Livro livro1 = new Livro(nome, autor, editora, qtdPaginas);
                            arquivo.escrever(livro1);
                            System.out.println("Livro adicionado com sucesso!");

                        } catch (InfoInvalidaException e){
                            System.out.println("Número de páginas inválida! Tente novamente!");
                            break;
                        }

                    } catch (InfoInvalidaException e) {
                        System.out.println("Editora inválido! Tente novamente!");
                        break;
                    }
                    break;

                case 2:
                    //Lendo o arquivo e adicionando no array de leitura
                    livrosArray = arquivo.ler();
                    //Mostrando os dados do arquivo
                    System.out.println("--- Lista de Livros ---");
                    for (int i = 0; i < livrosArray.size(); i++) {
                        System.out.println("Nome do livro: " + livrosArray.get(i).getNome());
                        System.out.println("Autor do livro: " + livrosArray.get(i).getAutor());
                        System.out.println("Editora do livro: " + livrosArray.get(i).getEditora());
                        System.out.println("Quantidade de páginas do livro: " + livrosArray.get(i).getQtdPaginas());
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    Collections.sort(livrosArray);
                    System.out.println("--- Lista de Produto ---");
                    for (int i = 0; i < livrosArray.size(); i++) {
                        System.out.println("Nome do livro: " + livrosArray.get(i).getNome());
                        System.out.println("Autor do livro: " + livrosArray.get(i).getAutor());
                        System.out.println("Editora do livro: " + livrosArray.get(i).getEditora());
                        System.out.println("Quantidade de páginas do livro: " + livrosArray.get(i).getQtdPaginas());
                        System.out.println("-------------------");
                    }
                    break;
                case 4:
                    Collections.sort(livrosArray);
                    Collections.reverse(livrosArray);
                    System.out.println("--- Lista de Produto ---");
                    for (int i = 0; i < livrosArray.size(); i++) {
                        System.out.println("Nome do livro: " + livrosArray.get(i).getNome());
                        System.out.println("Autor do livro: " + livrosArray.get(i).getAutor());
                        System.out.println("Editora do livro: " + livrosArray.get(i).getEditora());
                        System.out.println("Quantidade de páginas do livro: " + livrosArray.get(i).getQtdPaginas());
                        System.out.println("-------------------");
                    }
                    break;
                case 5:
                    //Opção de sair do menu, finalizando o código
                    flag = false;
                    break;
                default:
                    //Default padrão
                    System.out.println("Entre com uma opção válida");
                    break;
            }

        }
    }
}