package java14.recursos_avancados;
//Default Methods

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
Default Methods -> São métodos concretos implementados em
interfaces. Estes métodos, como são concretos, ou seja,
já possuem implementação, não precisam ser implementados
nas classes que implementares esta interface.

Novidade implementada a partir da versão 8 do Java.

Atualmente, estamos na versão 10 do Java.
 */
public class ProgramaDefaultMethod {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Florentina");

        //Collections.sort(palavras, comparador); //Ordena de forma alfabética

        palavras.sort(comparador); //Usando o Default Method

        //System.out.println(palavras);

        //Teste Default Method
        TesteDefaultMethods m = new MinhaClasse();
//        System.out.println(m.mensagem());
//        m.meu_metodo();

        //ForEach
        List<String> palavrasForEach = palavras;
//        for (String p: palavrasForEach) {
//            System.out.println(p);
//        }
        Consumer<String> consumidor = new ImprimeNaLinha();

        palavras.forEach(consumidor);//For each -> para cada

    }

}
