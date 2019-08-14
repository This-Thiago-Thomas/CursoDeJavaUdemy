package java14.recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classe anônima
public class ProgramaClassesAnonimas2 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Florentina");

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}
