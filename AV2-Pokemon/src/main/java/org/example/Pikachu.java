package org.example;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{

    private float soltaRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, String heldItem, float soltaRaios, float paralisiaEletrica) {
        super(nome, tipo, heldItem);
        this.soltaRaios = soltaRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Solta Raios: " + this.soltaRaios);
        System.out.println("Paralisia Eletrica: "+ this.paralisiaEletrica);

    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }

    @Override
    public void ataqueEspecial() {
        if(this.getHelditem() != null){
            float aux = 200;
            this.soltaRaios = soltaRaios+aux;
        }
        if (this.soltaRaios>750){
            System.out.println(this.getNome() + " conseguiu ganhar do seu oponente");
        }else {
            System.out.println(this.getNome() + " perdeu a batalha");
        }
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " está fazendo barulho!");
    }
}
