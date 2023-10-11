public abstract class Soldado {

    public static int qtdSoldade;
    private String nome;
    private long cpf;
    public ItemEspecial itemEspecial;

    // Construtor da classe
    public Soldado(String nome, long cpf, String item) {
        this.nome = nome;
        this.cpf = cpf;
        cpf++;
        itemEspecial = new ItemEspecial(item);

    }

    /*
        Método mostraInfo usando para mostrar ao usuário as informações gerais do soldado (nome e cpf) e uma analise se o soldado possui ou nao um item especial
        Método Sobrescrito nas classes filhas desta classe (Soldado)
     */
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if(itemEspecial.getTipo()!=null){
            System.out.println("Item Especial: " + this.itemEspecial.getTipo());
        }else {
            System.out.println(this.nome + " não tem item especial");
        }
    }

    //getter's e setter's para trabalhar no desenvolvimento do codigo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public ItemEspecial getItemEspecial() {
        return itemEspecial;
    }

    public void setItemEspecial(ItemEspecial itemEspecial) {
        this.itemEspecial = itemEspecial;
    }

    // metodo abstrato que será reescreito nas classe filhas
    public abstract void usandoItem();

}
