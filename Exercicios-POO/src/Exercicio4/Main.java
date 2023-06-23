package Exercicio4;

public class Main {
    public static void main(String[] args) {
         Mamifero camelo = new Mamifero("Camelo",3.45,4,"Marrom","Deserto",65,"vegetais");
         Peixe tubarao = new Peixe("Tubarão",20,0,"Cinza","Mar",19,"Barbatana");
         Mamifero urso = new Mamifero("Urso-do-canadá",230,4,"Preto","Floresta",50,"carne");
         Animal iguana = new Animal("Iguana",0.40,4,"Verde","Floresta",35);
         Mamifero leao = new Mamifero("Leão",1.8,4,"Marrom","Floresta", 80,"Carne");
         Mamifero mico = new Mamifero("Mico-Leão-Dourado",0.24,4,"Dourado","Floresta",20,"Frutas");

        System.out.println("===========================");
        System.out.println("JARDIM ZOOLÓGICO");
        System.out.println("===========================");

        camelo.mostrarInformacoes();
        System.out.println("====================================");
        tubarao.mostrarInformacoes();
        System.out.println("====================================");
        urso.mostrarInformacoes();
        System.out.println("====================================");
        iguana.mostrarInformacoes();
        System.out.println("====================================");
        leao.mostrarInformacoes();
        System.out.println("====================================");
        mico.mostrarInformacoes();
    }
}
