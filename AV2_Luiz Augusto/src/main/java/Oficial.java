public class Oficial extends Soldado implements Defesa{

    private String patente;

    // Construtor da classe
    public Oficial(String nome, long cpf, String item, String patente) {
        super(nome, cpf, item);
        this.patente = patente;
    }

    // metodo reescrito mostrando o mostraInfo da superclasse e mais as informações especificas de um Oficial
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente: " + this.patente);
    }

    // método sobrescrito da classe mãe e analise se o oficial possuiu um item especial
    @Override
    public void usandoItem() {
        if(itemEspecial.getTipo() != null){
            System.out.println(this.getNome() + " utilizando item especial");
        }else {
            System.out.println(this.getNome() + " não tem item especial para utilizar");
        }
    }

    // sobrescrita do método da Interface(Defesa), analisando se ele tem a capacidade de se defender baseado na confirmação de que possui um item especial
    @Override
    public void defender() {
        if(itemEspecial.getTipo()!=null){
            System.out.println(this.getNome() + " conseguiu se defender");
        }else{
            System.out.println(this.getNome() + " não se defender");
        }
    }
}
