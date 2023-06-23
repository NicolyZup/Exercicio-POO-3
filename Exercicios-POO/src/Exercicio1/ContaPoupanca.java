package Exercicio1;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, double taxaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }


    public void calcularSaldo(){
        double valorRendimento = this.getSaldo() * this.getTaxaRendimento();
        double novoSaldo = this.getSaldo() + valorRendimento;
        this.setSaldo(novoSaldo);
        System.out.println("Seu novo saldo é R$"+novoSaldo);
    }

}
