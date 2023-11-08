import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Scanner para leitura de dados
        Boolean flag = true; //Flag para o menu
        Arquivo arquivo = new Arquivo(); //Criando o arquivo
        ArrayList<Jogador> jogadoresArray = new ArrayList<>(); //ArrayList de Jogadores

        while (flag) {
            //Configurando as opções do menu
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar um novo Jogador ");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar jogadores em ordem decrescente em relação ao número da camisa");
            System.out.println("4 - Mostrar a quantidade de jogadores por posição");
            System.out.println("5 - Sair do Menu");

            //Operador do Menu
            int op = sc.nextInt();
            sc.nextLine(); // Para quebrar a linha e poder entrar com String sem problemas
            switch (op) {

                case 1: //Adicionando um novo Jogador no arquivo
                    System.out.println("--- Adicionando Jogador ---");

                    //Entrando com o nome do jogador
                    System.out.print("Entre com o nome do jogador: ");
                    String nome = sc.nextLine();

                    try {
                        // Entrando com a posicação do jogador
                        System.out.print("Entre com a posição do jogador: ");
                        String posicao = sc.nextLine();

                        //Verifiando se a posição é valida
                        if (posicao.equals("Goleiro") || posicao.equals("Atacante") || posicao.equals("Zagueiro")) {
                            //Se for válida, continua o código normalmente
                        } else {
                            throw new InfoInvalidaException("Posição inválida!");
                            //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                        }

                        try {
                            //Entrando com o numero da camisa do jogador
                            System.out.print("Entre com o número da camisa: ");
                            int camisa = sc.nextInt();
                            // verificação do numero da camisa
                            if (camisa > 0) {
                                //Se for válido, continua o código normalmente
                            } else {
                                throw new InfoInvalidaException("Jogador precisa ter uma camisa com numero maior de 0");
                                //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                            }

                            //Criando o Jogador, escrevendo no arquivo e adicionando ao Array
                            Jogador j1 = new Jogador(nome, camisa, posicao); // objeto do jogador pegando as variáveis auxiliares criadas ao longo do case 1
                            arquivo.escrever(j1);
                            System.out.println("Jogador adicionado com sucesso!");

                        } catch (InfoInvalidaException e){
                            System.out.println("Número de camisa inválida! Tente novamente!");
                            break;
                        }

                    } catch (InfoInvalidaException e) {
                        System.out.println("Posição inválida! Tente novamente!");
                        break;
                    }
                    break;

                case 2: // Mostrando as informações do arquivo(.txt)
                    //Lendo o arquivo e adicionando no array de leitura
                    jogadoresArray = arquivo.ler();
                    //Mostrando os dados do arquivo de acordo com a ordem que foram adicionados
                    System.out.println("--- Lista de Jogadores ---");
                    for (int i = 0; i < jogadoresArray.size(); i++) {
                        System.out.println("Nome do jogador: " + jogadoresArray.get(i).getNome());
                        System.out.println("Posição do jogador: " + jogadoresArray.get(i).getPosicao());
                        System.out.println("Camisa do jogador: " + jogadoresArray.get(i).getNumero());
                        System.out.println("-------------------");
                    }
                    break;
                case 3: //Ordenação descresente dos jogadores
                    // faz a ordenação dos jogadores e na classe Jogador faz a ordenação descresente usando o compareTo com o numero das camisas
                    Collections.sort(jogadoresArray);
                    //Mostrando os dados do arquivo em ordem descresente
                    System.out.println("--- Lista de Jogadores ---");
                    for (int i = 0; i < jogadoresArray.size(); i++) {
                        System.out.println("Nome do jogador: " + jogadoresArray.get(i).getNome());
                        System.out.println("Posição do jogador: " + jogadoresArray.get(i).getPosicao());
                        System.out.println("Camisa do jogador: " + jogadoresArray.get(i).getNumero());
                        System.out.println("-------------------");
                    }
                    break;
                case 4: //Quantidade de jogadores por posição
                    // variáveis para contagem de jogador por posição
                    int gol = 0, ata = 0, zag = 0;

                    for (int i = 0; i < jogadoresArray.size(); i++) {
                        // verificação de cada posicao do jogador dentro do array, e incrementação na variavél contadora responsável
                        if(jogadoresArray.get(i).getPosicao().equals("Goleiro")){
                            gol++;
                        }
                        if(jogadoresArray.get(i).getPosicao().equals("Atacante")){
                            ata++;
                        }
                        if(jogadoresArray.get(i).getPosicao().equals("Zagueiro")){
                            zag++;
                        }
                    }

                    // Mostrar a variável contadora de cada posição
                    System.out.println("-------------------");
                    System.out.println("O time tem " + gol + " goleiros!");
                    System.out.println("O time tem " + ata + " atacantes!");
                    System.out.println("O time tem " + zag + " zagueiros!");
                    System.out.println("-------------------");

                    break;
                case 5: // Sair do menu
                    //Opção de sair do menu, finalizando o código
                    flag = false;
                    break;
                default: //Default padrão
                    System.out.println("Entre com uma opção válida de menu!");
                    break;
            }

        }

    }
}
