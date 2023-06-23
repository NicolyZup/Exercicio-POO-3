package Exercicio4;

public class Peixe extends Animal{
    private String caracteristicas;


    public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    @Override
    public void mostrarInformacoes() {
       super.mostrarInformacoes();
       System.out.println("Características: "+getCaracteristicas());
    }
}
