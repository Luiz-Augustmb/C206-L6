package org.example;

public class Treinador {

    private String nome;
    private Pokemon[] pokemons = new Pokemon[10];


    public Treinador(String nome) {
        this.nome = nome;
    }

    public void addPokemon(Pokemon p){
        for(int i = 0 ; i < pokemons.length ; i++){
            if(pokemons[i]==null){
                pokemons[i] = p;
                //System.out.println("Pokemon adicionado!");
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome do treinador: " + this.nome);
        System.out.println("Poekemons: ");
        for (int i = 0 ; i < pokemons.length ; i++){
            if(pokemons[i]!=null){
                if (pokemons[i] instanceof Squirtle){
                    Squirtle s = (Squirtle) pokemons[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Squirtle: ");
                    s.mostraInfo();
                    s.atacar();
                    s.fazerBarulho();
                }
                else if (pokemons[i] instanceof Bulbassaur){
                    Bulbassaur b = (Bulbassaur) pokemons[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Bulbassaur: ");
                    b.mostraInfo();
                    b.atacar();
                    b.fazerBarulho();
                    b.ataqueEspecial();
                }
                else if (pokemons[i] instanceof Pikachu){
                    Pikachu p = (Pikachu) pokemons[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Pikachu: ");
                    p.mostraInfo();
                    p.atacar();
                    p.fazerBarulho();
                    p.ataqueEspecial();
                }
            }
        }
    }
}
