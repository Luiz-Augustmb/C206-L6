package org.example;

public class Main {
    public static void main(String[] args) {

        Nave n1 = new Nave("Estrela da morte", true);

        Jedi j1 = new Jedi("Yoda", 1, 100, "Verde", true);
        Droid d1 = new Droid("RDD2", 2, 60, false);
        Sith s1 = new Sith("Darth Vader", 3, 90, "Vermelho", true);

        n1.personagem[0] = j1;
        n1.personagem[1] = d1;
        n1.personagem[2] = s1;

        n1.mostraInfo();


    }
}