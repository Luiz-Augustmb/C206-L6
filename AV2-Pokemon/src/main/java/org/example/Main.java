package org.example;

public class Main {
    public static void main(String[] args) {

        Treinador t1 = new Treinador("Ashe");

        Squirtle s1 = new Squirtle("Squirte", "Agua", "Bomba de agua" , 200);
        Bulbassaur b1 = new Bulbassaur("Bulbassaur", "Planta", "Bomba de planta", 700);
        Pikachu p1 = new Pikachu("Pikachu", "Eletrico", "Bomba de raios", 700, 650);

        t1.addPokemon(s1);
        t1.addPokemon(b1);
        t1.addPokemon(p1);

        t1.mostraInfo();



    }
}