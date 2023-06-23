package Exercicio1;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, int numeroConta, double saldo) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = 1.000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        double saldoDisponivel = this.getSaldo() + this.getLimite();
        if(valor > saldoDisponivel){
            System.out.println("Você não possui limite suficiente para sacar.");
        } else {
            double novoSaldo = saldoDisponivel - valor;
            setSaldo(novoSaldo); ;
        }
    }
}
