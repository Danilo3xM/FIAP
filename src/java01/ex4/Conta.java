package java01.ex4;

public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;
    public abstract void saque(double valor);
    public void exibirSaldo(){
        System.out.println(saldo);
    }
}