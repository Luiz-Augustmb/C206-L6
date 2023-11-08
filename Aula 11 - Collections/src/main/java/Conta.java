public class Conta implements Comparable<Conta>{

    private String dono;
    private int num;

    public Conta(String dono, int num) {
        this.dono = dono;
        this.num = num;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Conta o) {
        return dono.compareTo(o.dono);
    }
}
