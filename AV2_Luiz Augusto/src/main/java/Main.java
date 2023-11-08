public class Main {
    public static void main(String[] args) {
        // instanciação de um exercito novo
        Exercito exercito = new Exercito("Exercito do Inatel");

        // instanciação de cada Soldado, um de cada tipo
        Sargento s1 = new Sargento("Luiz Augusto", 1597536248, "Arma nuclear", "Ataques Terrestes", 500);
        Oficial o1 = new Oficial("Pedro", 123456789, null, "Major");
        MedicoMilitar mm1 = new MedicoMilitar("Gabriel", 987654321, "Kit-Medico", 20, 850);

        // atribuindo cada soldado ao meu novo exercito
        exercito.addSoldado(s1);
        exercito.addSoldado(o1);
        exercito.addSoldado(mm1);

        // chamada o método mostraInfo da classe exercito
        exercito.mostraInfo();

    }
}
