package org.example;

public abstract class Personagem {
    private String nome;
    private int id;
    private int poder;
    public static int cont;

    public Personagem(String nome, int id, int poder) {
        this.nome = nome;
        this.id = id;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public abstract void travarBatalha();

    public void mostraInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Poder: " + this.poder);
    }


}
