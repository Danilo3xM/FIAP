package java01.ex1;

public class Ex1 {
    public static void ex1(){
        ContaDigital contaDigital = new ContaDigital();
        ContaEspecial contaEspecial = new ContaEspecial();

        //Conta Especial
        contaEspecial.deposita(100);
        contaEspecial.saque(10);
        System.out.println("Conta Especial - Saldo: "+ contaEspecial.getSaldo());

        //Conta Digital
        contaDigital.deposita(-10);
        contaDigital.saque(10);
        System.out.println("Conta Digital - Saldo: " + contaDigital.getSaldo());
    }
}
