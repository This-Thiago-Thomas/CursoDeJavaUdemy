package java14.recursos_avancados;
//Lambdas

/*
Lambdas ou Expressões lambdas, são funcões anônimas.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ProgramaLambdas {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Florentina");

        //Expressão comparador Sem lambda
        palavras.sort(comparador);

        //Forma 1
        //Expressão comparador com lambda
//        palavras.sort((s1, s2) -> {
//            if(s1.length() < s2.length()){
//                return -1;
//            }else if(s1.length() > s2.length()){
//                return 1;
//            }else {
//                return 0;
//            }
//        });

        //Forma 2
        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        //Expressão lambda - forma 1
//        palavras.forEach((String s) -> {
//            System.out.println(s);
//        });

        //Expressão lambda - forma 2
        palavras.forEach(s -> System.out.println(s));


    }

}
