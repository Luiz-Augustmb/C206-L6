public abstract class Funcionario {

    // atributos de um funcionario

    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostraInfo(){
        System.out.printf("Nome do funcionario: " + this.nome);
        System.out.printf("Idade do funcionario: " + this.idade);
        System.out.printf("Salario do funcionario: " + this.salario);
    }

    public abstract void executaAcao();

    public abstract double  salarioBonus();

}
