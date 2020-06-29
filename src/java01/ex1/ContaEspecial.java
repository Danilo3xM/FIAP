package java01.ex1;

public class ContaEspecial extends ContaBancaria{
    @Override
    public void saque(double valor)
    {
        saldo-=(valor*1.1);
    }
}
