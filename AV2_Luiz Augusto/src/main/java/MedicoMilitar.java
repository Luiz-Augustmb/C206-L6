public class MedicoMilitar extends Soldado implements Curar{

    private int anosEsperiencia;
    private int capacidadeEmergencia;

    // Construtor da classe
    public MedicoMilitar(String nome, long cpf, String item, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf, item);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    // metodo reescrito mostrando o mostraInfo da superclasse e mais as informações especificas de um Medico Militar
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos Experiencia: " + this.anosEsperiencia);
        System.out.println("Capacidade de Emergencia: " + this.capacidadeEmergencia);
    }

    // método sobrescrito da classe mãe e analise para modificação do valor da capacidadeEmergencia se ele possuiu um item especial
    @Override
    public void usandoItem() {
        if(itemEspecial.getTipo()!=null){
            this.capacidadeEmergencia = capacidadeEmergencia + 100;
            System.out.println(this.getNome() + " utilizando item especial");
            System.out.println("Nova Capacidade de Emergencia com o item especial: " + this.capacidadeEmergencia);
        }else {
            System.out.println(this.getNome() + " não tem item especial para utilizar");
        }
    }

    // sobrescrita do método da interface (Curar), onde é feita a análise do valor de capacidadeEmergencia e tomada de decisão
    @Override
    public void curar() {
        if(capacidadeEmergencia > 920){
            System.out.println(this.getNome() + " está curando seus companheiros");
        }else {
        System.out.println(this.getNome() + " não está mais curando seus companheiros");
        }
    }
}
