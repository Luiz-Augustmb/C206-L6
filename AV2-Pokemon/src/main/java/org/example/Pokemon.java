package org.example;

public abstract class Pokemon {

    public static int qtdPokemon;
    private String nome;
    private String tipo;
    public HeldItem helditem;

    public static int getQtdPokemon() {
        return qtdPokemon;
    }

    public static void setQtdPokemon(int qtdPokemon) {
        Pokemon.qtdPokemon = qtdPokemon;
    }

    public Pokemon(String nome, String tipo, String heldItem) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
        helditem = new HeldItem(heldItem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public HeldItem getHelditem() {
        return helditem;
    }

    public void setHelditem(HeldItem helditem) {
        this.helditem = helditem;
    }

    public  void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Held Item: " + this.helditem.getTipo());
    }

    public abstract void atacar();
}
