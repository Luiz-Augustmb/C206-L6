package org.example;

public class Nave {
    private String nome;
    private boolean velocidadeLuz;
    public Personagem[] personagem = new Personagem[10];

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("Nome da Nave: " + this.nome);
        if(velocidadeLuz){
            System.out.println("A nave consegue ir na Velocidade da Luz");
        }else {
            System.out.println("A não não consegue ir na Velocidade da Luz");
        }

        for (int i = 0; i < personagem.length ; i++){
            if(personagem[i]!=null){
                if(personagem[i] instanceof Jedi){
                    Jedi j = (Jedi) personagem[i];
                    System.out.println("Infromações sobre o Jedi: ");
                    j.mostraInfo();
                    j.usarForca();
                    j.travarBatalha();
                    j.treinarPadawan();
                    j.trocarSabre("Roxo");
                }
                else if (personagem[i] instanceof Sith){
                    Sith s = (Sith) personagem[i];
                    System.out.println("Infromações sobre o Sith: ");
                    s.mostraInfo();
                    s.usarForca();
                    s.travarBatalha();
                    s.corromperJedi();
                    s.trocarSabre("Laranja");
                }
                else if (personagem[i] instanceof  Droid){
                    Droid d = (Droid) personagem[i];
                    System.out.println("Infromações sobre o Droid: ");
                    d.mostraInfo();
                    d.hackearSistema();
                    d.travarBatalha();
                }
            }
        }
    }
}
