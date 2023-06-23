package Exercicio1;

public class Teste {
    public static void main(String[] args) {
        //criar contas
        ContaBancaria cliente1 = new ContaPoupanca("Nicoly Barros", 234543,2300, 0.5);
        ContaBancaria cliente2 = new ContaEspecial("Marcos Paulo", 357644,3000);

        //testando métodos
        cliente1.sacar(300);
        cliente1.mostrarInformacoes();
        cliente1.depositar(250);
        cliente1.mostrarInformacoes();
        cliente1.calcularSaldo();
        cliente1.mostrarInformacoes();

        cliente2.sacar(3303);
        cliente2.mostrarInformacoes();
        cliente2.depositar(40);
        cliente2.mostrarInformacoes();
    }
}
