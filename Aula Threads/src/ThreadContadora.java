public class ThreadContadora extends Thread{

    String nomeThread;
    int intervalo;

    public ThreadContadora(String nomeThread, int intervalo) {
        this.nomeThread = nomeThread;
        this.intervalo = intervalo;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.nomeThread + " - " + i);
            try{
                Thread.sleep(this.intervalo);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
