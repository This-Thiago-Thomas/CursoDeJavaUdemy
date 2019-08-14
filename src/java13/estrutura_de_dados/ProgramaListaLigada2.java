package java13.estrutura_de_dados;

import java.util.LinkedList;
import java.util.List;

public class ProgramaListaLigada2 {

    public static void main(String[] args) {

        List<String> lista = new LinkedList<String>();

        lista.add("Felicity");
        lista.add("Maria Paula");
        lista.add("Josefa");
        lista.add("Paulina");
        lista.add(3,"João");

        System.out.println(lista.size());
        System.out.println(lista);

    }
}
