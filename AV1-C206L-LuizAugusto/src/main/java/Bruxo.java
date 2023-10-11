public class Bruxo {

    String nome;
    String casa;
    String varinha;
    boolean quadribol;

    public Bruxo(String nome, String casa, String varinha, boolean quadribol) {
        this.nome = nome;
        this.casa = casa;
        this.varinha = varinha;
        this.quadribol = quadribol;
    }

    public void mostraInfo(){
        System.out.println("------------------------------");
        System.out.println("Bruxos->");
        System.out.println("Nome:" + this.nome);
        System.out.println("Casa:" + this.casa);
        System.out.println("Varinha:" + this.varinha);
        if(this.quadribol){
            System.out.println("Joga de quadribol!");
        }
    }
}
