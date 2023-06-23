package Exercicio3;

public class Main {
    public static void main(String[] args) {

        Dicionario objeto1 = new Dicionario("bola","azul");
        Dicionario objeto2 = new Dicionario("boneca","amarela");
        Dicionario objeto3 = new Dicionario("dado","rosa");

        for(String chave : objeto3.getChave()){
            for (String valor : objeto3.getValor()){
                System.out.println(chave +"->"+valor);
            }
        }
    }
}
