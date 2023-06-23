package Exercicio4;

public class Animal {
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }


    public String getNome() {
        return nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Comprimento: "+getComprimento());
        System.out.println("Número de patas: "+getNumeroPatas());
        System.out.println("Cor: "+getCor());
        System.out.println("Ambiente: "+getAmbiente());
        System.out.println("Velocidade: "+getVelocidade());
    };
}
