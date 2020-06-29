package java01.ex1;

public class ContaDigital extends ContaBancaria{
    @Override
    public void saque(double valor)
    {
       if (saldo < 0){
           System.out.println("Saldo negativo. Saque proíbido.");
       }
       else
           saldo-=valor;
    }
}
