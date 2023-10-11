package org.example;

public class Squirtle extends Pokemon implements FazerBarulho{

    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo, String heldItem , float multiplicadorAgua) {
        super(nome, tipo, heldItem);
        this.multiplicadorAgua = multiplicadorAgua;
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Multiplicador de Agua: " + this.multiplicadorAgua);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }


    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " está fazendo barulho!");
    }
}
