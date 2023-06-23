package Exercicio2;

public class ContaCorrente implements Tributos{
    private double conta;

    public ContaCorrente(double conta){
        this.conta=conta;
    }
    @Override
    public double calcularTributos() {
        return 1/100 * conta;
    }
}
