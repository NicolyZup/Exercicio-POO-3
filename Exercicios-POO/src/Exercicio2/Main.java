package Exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(230.90);
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        System.out.println(contaPoupanca.calcularTributos());
        System.out.println(contaCorrente.calcularTributos());
        System.out.println(seguroDeVida.calcularTributos());
    }
}
