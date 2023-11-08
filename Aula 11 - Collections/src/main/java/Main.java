import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList itens = new ArrayList();

        Conta c1 = new Conta();

        itens.add(7);
        itens.add("luiz");
        itens.add(10.4);
        itens.add(c1);

        itens.remove(c1);

        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i));
        }
         */

        /*
        ArrayList <Integer> inteiros = new ArrayList<>();

        inteiros.add(2);
        inteiros.add(24);
        inteiros.add(8);
        inteiros.add(12);
        inteiros.add(4);
        inteiros.add(9);

        for (int i = 0; i < inteiros.size(); i++) {
            //System.out.println(inteiros.get(i));
        }

       // Collections.sort(inteiros);
       // Collections.reverse(inteiros);

        System.out.println(inteiros.indexOf(12));
        System.out.println(inteiros.isEmpty());
        inteiros.clear();

        for (int i = 0; i < inteiros.size(); i++) {
           System.out.println(inteiros.get(i));

        }
         */

        ArrayList <Conta> contas = new ArrayList<>();

        Conta c1 = new Conta("Luiz", 3500);
        Conta c2 = new Conta("Anna", 2000);
        Conta c3 = new Conta("João", 2500);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        Collections.sort(contas);
        Collections.reverse(contas);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getDono());
            System.out.println(contas.get(i).getNum());
        }

    }
}
