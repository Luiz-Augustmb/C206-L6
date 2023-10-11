package org.example;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{

    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, String heldItem, float luminosidadeAmbiente) {
        super(nome, tipo, heldItem);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Luminosidade Ambiente: " + this.luminosidadeAmbiente);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " está fazendo barulho!");
    }

    @Override
    public void ataqueEspecial() {
        if(this.getHelditem() != null){
            float aux = 300;
            this.luminosidadeAmbiente = luminosidadeAmbiente+aux;
        }
        if (this.luminosidadeAmbiente > 650){
            System.out.println(this.getNome() + " conseguiu ganhar de seu oponente");
        }else {
            System.out.println(this.getNome() + " perdeu a batalha");
        }
    }
}
