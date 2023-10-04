public class Engenheiro extends Funcionario implements GerenciaProjetos{

    private String ramo;

    @Override
    public void executaAcao() {
        System.out.println("O engenheiro esta codando");
    }

    @Override
    public double salarioBonus() {
        double sn = getSalario() + 300;
        setSalario(sn);
        return getSalario();
    }

    @Override
    public void gerencia() {
        System.out.println("O engenheiro " + getNome() + " esta trabalhando");
    }
}
