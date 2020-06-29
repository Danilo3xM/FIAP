package java01.ex2;

public class ContaBancaria {
    protected double saldo;
    protected final double taxaBancaria = 1;
    public void saque(double valor)
    {
        saldo-=valor;
    }
    public void deposita(double valor)
    {
        saldo+=valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getTaxaBancaria()
    {
        return taxaBancaria;
    }
    public double getTaxaBancaria(int dias)
    {
        return taxaBancaria*dias;
    }
    public double getTaxaBancaria(int dias, int meses) {
        int totalDias = meses*30 + dias;

        return taxaBancaria*totalDias;
    }
}