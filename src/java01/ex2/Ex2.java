package java01.ex2;

public class Ex2 {
    public static void ex2(){
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Taxa Bancária (): "+ contaBancaria.getTaxaBancaria());
        System.out.println("Taxa Bancária (dias): "+ contaBancaria.getTaxaBancaria(10));
        System.out.println("Taxa Bancária (dias, meses): "+ contaBancaria.getTaxaBancaria(10,12));
    }
}
