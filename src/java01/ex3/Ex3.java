package java01.ex3;

public class Ex3{
    public static void ex3(){
        ContaEspecial contaEspecial = new ContaEspecial("João","Rua Tal","0123456789");

        //Conta Especial

        System.out.println("Conta Especial - Dados: "+ contaEspecial.nomeCliente);
        System.out.println("Conta Especial - Dados: "+ contaEspecial.endCliente);
        System.out.println("Conta Especial - Dados: "+ contaEspecial.cpfCliente);
    }
}
