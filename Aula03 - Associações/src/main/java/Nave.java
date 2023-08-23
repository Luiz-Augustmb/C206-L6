public class Nave {
    String nome;
    int velocidade;
    Arma arma = null;

    public Nave(String nome, int velocidade, String tipo, int poder) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.arma = new Arma(tipo, poder);
    }

    public void mostraInfo(){
        System.out.println("Nome da nave: " + nome);
        System.out.println("Velocidade da nave: " + velocidade);
    }

    /*
    public void addArma(Arma arminha){
        System.out.println("Arma adicionada");
        this.arma = arminha;
    }

    */

}
