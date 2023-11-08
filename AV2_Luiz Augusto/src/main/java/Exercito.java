public class Exercito {
    private String nome;
    Soldado[] soldados = new Soldado[10];

    // Construtor da classe
    public Exercito(String nome) {
        this.nome = nome;
    }

    // método para adicionar cada soldado no array
    public void addSoldado(Soldado s){
        for (int i = 0 ; i < soldados.length ; i++){
            if(soldados[i]==null){
                soldados[i] = s;
                //System.out.println("Soldado adicionado!");
                break;
            }
        }
    }

    /*
        Método que mostra as informações do exercito e de cada soldado do array, baseado em uma análise do tipo da instancia do indice do array
     */
    public void mostraInfo(){
        System.out.println("Informações Exército: ");
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Soldados: ");
        for(int i = 0 ; i < soldados.length ; i++){
            if(soldados[i]!=null){
                if(soldados[i] instanceof Sargento){
                    Sargento s = (Sargento) soldados[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Sargento: ");
                    s.mostraInfo();
                    s.usandoItem();
                    s.defender();
                } else if(soldados[i] instanceof Oficial){
                    Oficial o = (Oficial) soldados[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Oficial: ");
                    o.mostraInfo();
                    o.usandoItem();
                    o.defender();
                } else if(soldados[i] instanceof MedicoMilitar){
                    MedicoMilitar medico = (MedicoMilitar) soldados[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Medico Militar: ");
                    medico.mostraInfo();
                    medico.usandoItem();
                    medico.curar();
                }
            }
        }
    }
}
