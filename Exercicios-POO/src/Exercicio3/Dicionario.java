package Exercicio3;

import java.util.List;

public class Dicionario {
    private List<String> chave;
    private List<String> valor;

    public Dicionario(String chave, String valor) {
        this.chave.add(chave);
        this.valor.add(valor);
    }

    public List<String> getChave() {
        return chave;
    }

    public void setChave(List<String> chave) {
        this.chave = chave;
    }

    public List<String> getValor() {
        return valor;
    }

    public void setValor(List<String> valor) {
        this.valor = valor;
    }


}
