package Exercicio3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dicionario {
    private Map<String, List<String>> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarChaveValor(String chave, List<String> valor){
        dicionario.put(chave,valor);
    }

    public void mostrarDados(){
        for( String chave : dicionario.keySet()){
            List<String> valor = dicionario.get(chave);
            System.out.println(chave+" -> "+valor);
        }
    }
}
