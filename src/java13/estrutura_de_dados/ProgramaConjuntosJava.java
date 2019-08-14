package java13.estrutura_de_dados;
//Implementação dos conjuntos do java

import java.util.HashSet;
import java.util.Set;

public class ProgramaConjuntosJava {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        System.out.println(nomes);

        nomes.add("Angelina");
        nomes.add("Amelia");
        nomes.add("Barbara");
        nomes.add("Bianca");

        String nome1 = "Angelina";
        String nome2 = "Ana";
        String nome3 = "Gabriela";

        System.out.println(nome1.hashCode());
        System.out.println(nome2.hashCode());
        System.out.println(nome3.hashCode());
    }
}
