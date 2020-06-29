package java01.ex5;

public abstract class ContaBancaria {
    protected double saldo;
    protected Cliente cliente;
    public abstract void saque(double valor);
    public void exibirSaldo(){
        System.out.println(saldo);
    }
}