public class Main {

    public static void main(String[] args) {

        Funcionario fun1 = new Funcionario("Luiz", 123123123, 21, 300);
        Funcionario fun2 = new Funcionario("Joao", 456456456, 21, 500);

        fun2.tiraFerias("Dezembro", 2);
        System.out.println(fun1.salarioAnual());
        System.out.println("Luiz decimo terceiro");
        System.out.println(fun1.salarioAnual(1000));

    }
}
