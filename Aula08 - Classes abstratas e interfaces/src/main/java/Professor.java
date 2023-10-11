public class Professor extends Funcionario{

    private String materia;


    public void corrigirProvas(){
        System.out.println("O professor" + getNome() + " esta corrigindo provas");
    }

    @Override
    public void executaAcao() {
        System.out.println("O Professor está corrigindo provas");
    }

    @Override
    public double salarioBonus() {
        double sn = getSalario() + 500;
        setSalario(sn);
        return getSalario();
    }


}
