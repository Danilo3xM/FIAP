package java01.ex5;

public class ContaPoupanca extends ContaBancaria implements Tributacao {
    public void saque(double valor) {
        saldo -= valor + 0.03 * valor;
    }

    @Override
    public double calcularTributo() {
        return saldo * 0.03;
    }
}
