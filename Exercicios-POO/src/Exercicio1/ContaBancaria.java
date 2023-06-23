package Exercicio1;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > this.getSaldo()){
            System.out.println("Você não possui saldo suficiente para sacar.");
        } else {
            double novoSaldo = this.getSaldo() - valor;
            setSaldo(novoSaldo); ;
        }
    }

    public void depositar(float valor){
        if(valor <1){
            System.out.println("Valor inválido!");
        } else {
            double novoSaldo = this.getSaldo() + valor;
            setSaldo(novoSaldo);
        }
    }

    public void mostrarInformacoes(){
        System.out.println("Cliente: "+getNomeCliente());
        System.out.println("Número conta: "+getNumeroConta());
        System.out.println("Saldo disponível: "+getSaldo());
        System.out.println("==================================");
    }

    public void calcularSaldo() {
    }
}
