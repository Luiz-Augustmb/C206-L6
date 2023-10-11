public class Arquiteto extends Funcionario{

    private String especialidade;

    @Override
    public void executaAcao() {
        System.out.println("Arquiteto está desenhando uma planta");
    }

    @Override
    public double salarioBonus() {
        double sn = getSalario() + 100;
        setSalario(sn);
        return getSalario();
    }
}
