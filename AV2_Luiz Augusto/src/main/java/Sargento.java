public class Sargento extends Soldado implements Defesa{

    private String especializacao;
    private int experienciaCombate;

    // Construtor da classe
    public Sargento(String nome, long cpf, String item, String especializacao, int experienciaCombate) {
        super(nome, cpf, item);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    // metodo reescrito mostrando o mostraInfo da superclasse e mais as informações especificas de um Sargento
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialização: " + this.especializacao);
        System.out.println("Experiencia de Combate: " + this.experienciaCombate + " anos");
    }

    // método sobrescrito da classe mãe e analise para modificação do valor da experienciaCombate se ele possuiu um item especial
    @Override
    public void usandoItem() {
        if(this.itemEspecial.getTipo() != null){
            this.experienciaCombate = experienciaCombate + 300;
            System.out.println(this.getNome() + " utilizando item especial");
            System.out.println("Nova experiencia de combate com item especial: "+ this.experienciaCombate);
        }else {
            System.out.println(this.getNome() + " não tem item especial para utilizar");
        }
    }

    // sobrescrita do método da Interface(Defesa), analisando se ele tem a capacidade de se defender baseado na análise da experienciaCombate
    @Override
    public void defender() {
        if(experienciaCombate > 650){
            System.out.println(this.getNome() + " conseguiu se defender");
        }else {
            System.out.println(this.getNome() + " não se defendeu");
        }
    }
}
