package java01.ex5;

public class Ex5 {
    public static void ex5() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.saldo = 100;

        System.out.println("Calcular Tributo - Interface: " + contaPoupanca.calcularTributo());
    }
}
