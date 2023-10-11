package org.example;

public class Droid extends Personagem{

    private boolean hostil;

    public Droid(String nome, int id, int poder, boolean hostil) {
        super(nome, id, poder);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if (hostil){
            System.out.println("O Droid é hostil");
        }else {
            System.out.println("O Droid não é hostil");
        }
    }

    @Override
    public void travarBatalha() {
        if(this.hostil){
            System.out.println(this.getNome() + " travou uma batalha com um Jedi");
            int aux = this.getPoder() + 1;
            this.setPoder(aux);
        }else {
            System.out.println(this.getNome() + " travou uma batalha com um Sith");
            int aux = this.getPoder() + 1;
            this.setPoder(aux);
        }
    }

    public void hackearSistema(){
        System.out.println(this.getNome() + " hackeou o sistema da nave!");
    }
}
