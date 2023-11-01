public class Main {

    public static void main(String[] args) {

        ThreadContadora tc1 = new ThreadContadora("Thread 1 ", 500);
        ThreadContadora tc2 = new ThreadContadora("Thread 2 ", 1000);
        ThreadContadora tc3 = new ThreadContadora("Thread 3 ", 2000);

        tc1.start();
        tc2.start();
        tc3.start();

    }
}
