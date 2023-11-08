public class Jogador implements Comparable<Jogador>{

    private String nome;
    private int numero;
    private String posicao;

    // Construtor da calsse com os atributos
    public Jogador(String nome, int numero, String posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    // Contrutor da classe sem os atributos
    public Jogador() {
    }


    // Getters e Setters dos atributos private da classe Jogador
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    // Sobrescrição do método compareTo da intervaface Comparable, aqui sendo usada para encontrar a ordem de jogadores descresentes baseado no numero da camisa
    @Override
    public int compareTo(Jogador o) {
        return Integer.compare(o.numero, this.numero);
    }
}
