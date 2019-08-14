package java14.recursos_avancados;

public interface TesteDefaultMethods {

    int VALOR = 9;

    public String mensagem();

    default void meu_metodo(){
        System.out.println("Meu default method...");
    }
}
