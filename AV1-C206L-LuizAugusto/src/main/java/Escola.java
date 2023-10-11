public class Escola {

    String nome;
    String diretor;

    Bruxo[] bruxo = new Bruxo[100];

    public Escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
    }

    public void adicionarBruxo(Bruxo b){
        for (int i = 0; i < bruxo.length ; i++){
            if(bruxo[i]==null) {
                bruxo[i] = b;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("------------------------------");
        System.out.println("Escola->");
        System.out.println("Nome: " + this.nome);
        System.out.println("Diretor: " + this.diretor);
        for (int i = 0; i < bruxo.length ; i++){
            if(bruxo[i]!=null){
                bruxo[i].mostraInfo();
            }
        }

        System.out.println("------------------------------");
    }

    public void jogadoresQua(){
        System.out.println("Jogadores de Quadribol ->");
        for (int i = 0; i < bruxo.length ; i++){
            if(bruxo[i]!=null) {
                if (bruxo[i].quadribol) {
                    System.out.println(bruxo[i].nome);
                }
            }
        }
        System.out.println("------------------------------");
    }

    public void varinhaCerejeira(){
        int cont = 0;
        for (int i = 0; i < bruxo.length ; i++){
            if(bruxo[i]!=null) {
                if (bruxo[i].varinha.equals("Varinha de Cerejeira")) {
                    cont++;
                }
            }
        }
        System.out.println(cont + " bruxos possuem a Varinha de Cerejeira");
        System.out.println("------------------------------");
    }
}
