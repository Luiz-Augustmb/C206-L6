package org.example;

public class Jedi extends Personagem implements Treinamento,Forca{
    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int id, int poder, String corSabre, boolean mestre) {
        super(nome, id, poder);
        sabre = new Sabre(corSabre);
        this.mestre = mestre;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(this.getNome() + " tem um sabre de luz " + this.sabre.getCor());
        if (this.mestre){
            System.out.println("O Jedi é um mestre");
        }else{
            System.out.println("O Jedi não é um mestre");
        }
    }

    @Override
    public void travarBatalha() {
        System.out.println(this.getNome() + " travou uma batalha com um Sith");
        int aux = this.getPoder() + 1;
        this.setPoder(aux);
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou a força para o bem");
        int aux = this.getPoder() + 5;
        this.setPoder(aux);
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
        System.out.println(this.getNome() + " agora possui um sabre de luz " + this.sabre.getCor());
    }

    @Override
    public void treinarPadawan() {
        if (this.mestre || this.getPoder() > 60){
            System.out.println(this.getNome() + " treinou um Padwan");
        }else {
            System.out.println(this.getNome() + " ainda não consegue treinar Padwans");
        }
    }
}
