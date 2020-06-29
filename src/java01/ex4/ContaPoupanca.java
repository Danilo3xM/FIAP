package java01.ex4;

public class ContaPoupanca extends Conta {
    public void saque(double valor) {
        saldo-=valor+0.03*valor;
    }
}
