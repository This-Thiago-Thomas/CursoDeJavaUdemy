package java14.recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anônimas

/*
Classes anônimas são classes sem nome.

Quando utilizar??

- Utilizamos classes anônimas quandos temos interfaces com um ou poucos
métodos e não precisamos reaproveitar o código da classe.

Ou seja, se não iremos precisar reaproveitar a classe em um outro lugar
do nosso sistema e esta classe que eu deveria criar iria apenas
implementar uma interface com um ou poucos métodos, podemos utilizar
o conceito de classe anônima.

*/

//Classes Anônimas
public class ProgramaClassesAnonimas {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+"OIE");
            }
        };

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Florentina");

        palavras.sort(comparador);

        palavras.forEach(consumidor);

        System.out.println(palavras);

    }
}
