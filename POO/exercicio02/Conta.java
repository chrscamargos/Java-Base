package exercicio02;

public class Conta {
    public double saldo;
    public int nConta;
    public int agencia;

    public void sacar(double saque){
        if (saldo >= saque){
            saldo = saldo - saque;
            IO.println("saque realizado, saldo atual: " + saldo);
        } else {
            IO.println("saldo insuficiente!");
        }

    }

    public String depositar(double deposito){
        saldo = saldo + deposito;
        return "seu novo saldo é: " + saldo;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", nConta=" + nConta +
                ", agencia=" + agencia +
                '}';
    }
}
