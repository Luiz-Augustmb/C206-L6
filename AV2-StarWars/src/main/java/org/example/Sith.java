package org.example;

public class Sith extends Personagem implements Forca{

    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int id, int poder, String corSabre, boolean darth) {
        super(nome, id, poder);
        sabre = new Sabre(corSabre);
        this.darth = darth;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(this.getNome() + " usa um sabre de luz " + this.sabre.getCor());
        if (darth){
            System.out.println("O Sith é um Darth");
        }else {
            System.out.println("O Sith não é um Darth");
        }
    }

    @Override
    public void travarBatalha() {
        System.out.println(this.getNome() + " travou uma batalha com um Jedi");
        int aux = this.getPoder() + 1;
        this.setPoder(aux);
    }

    public void corromperJedi(){
        if(darth && this.getPoder() >60 ){
            System.out.println(this.getNome() + " levo um jedi para o lado negro da força");
        }else {
            System.out.println(this.getNome() + " ainda não consegue corromper Jedis");
        }
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou o ladro negro da força");
        int aux = this.getPoder() + 3;
        this.setPoder(aux);
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
        System.out.println(this.getNome() + " agora possui um sabre de luz " + this.sabre.getCor());
    }
}
