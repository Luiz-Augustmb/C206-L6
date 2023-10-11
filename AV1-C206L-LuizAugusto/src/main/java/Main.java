import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Bruxo[] bruxos = new Bruxo[100];

        Escola newEscola = new Escola("Inatel Magias" , "Luiz Augusto");
        boolean flag = true;
        int opcaoMenu;

        while (flag){
            System.out.println("Bem vindo bruxo!");
            System.out.println("1 - Adicionar um bruxo ");
            System.out.println("2 - Mostrar informações da Escola e de seus bruxo");
            System.out.println("3 - Mostrar os jogadores de Quadribol");
            System.out.println("4 - Mostrar a quantidade de bruxos que tem a Varinha Cerejeira");
            System.out.println("5 - Sair do menu");

            opcaoMenu = sc.nextInt();
            sc.nextLine();
            switch (opcaoMenu) {
                case 1:
                    System.out.print("Nome do bruxo: ");
                    String nomeBruxo = sc.nextLine();
                    System.out.print("Casa do bruxo: ");
                    String casaBruxo = sc.nextLine();
                    if(casaBruxo.equals("Grifinoria") || casaBruxo.equals("Sonserina") || casaBruxo.equals("Corvinal") || casaBruxo.equals("Lufa-Lufa")) {
                        System.out.print("Varinha do bruxo: ");
                        String varinhaBruxo = sc.nextLine();
                        if(varinhaBruxo.equals("Varinha de Azevinho") || varinhaBruxo.equals("Varinha de Cerejeira") || varinhaBruxo.equals("Varinha de Sabugueiro")) {
                            System.out.print("Jogador de Quadribol?(TRUE/FALSE): ");
                            boolean jogaQuad = sc.nextBoolean();

                            Bruxo novoBruxo = new Bruxo(nomeBruxo, casaBruxo, varinhaBruxo, jogaQuad);
                            newEscola.adicionarBruxo(novoBruxo);

                        }else {
                            System.out.println("Varinha Invalida!");
                            System.out.println("------------------------------");
                        }
                    }else {
                        System.out.println("Casa Invalida!");
                        System.out.println("------------------------------");
                    }

                    break;
                case 2:
                    newEscola.mostraInfo();
                    break;
                case 3:
                    newEscola.jogadoresQua();
                    break;
                case 4:
                    newEscola.varinhaCerejeira();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Valor Inválido");
                    break;
            }
        }

       sc.close();
    }
}
