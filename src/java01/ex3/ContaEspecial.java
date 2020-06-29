package java01.ex3;

public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
        super(nomeCliente, endCliente, cpfCliente);
    }

    @Override
    public void saque(double valor) {
        saldo -= (valor * 1.1);
    }
}
