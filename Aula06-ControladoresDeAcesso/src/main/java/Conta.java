public class Conta {

    String nome;
    long cpf;
    private float saldo = 0;

    public Conta(String nome, long cpf, float saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
