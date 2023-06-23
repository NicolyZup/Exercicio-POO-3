package Exercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

       Dicionario dicionario = new Dicionario();

       dicionario.adicionarChaveValor("Bola", List.of("azul"));
       dicionario.adicionarChaveValor("Boneca", List.of("amarela"));
       dicionario.adicionarChaveValor("Dado", List.of("rosa"));

       dicionario.mostrarDados();
    }
}
