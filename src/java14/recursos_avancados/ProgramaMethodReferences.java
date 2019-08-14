package java14.recursos_avancados;
//Method Referenes

/*
Podem ser consideradas como simplicações das expressões lambdas.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class ProgramaMethodReferences {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        //Forma 1
//        Function<String, Integer> tamanho = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };
//
//        Comparator<String> comparador = Comparator.comparing(tamanho);
//        palavras.sort(comparador);


        //Forma 2
//        Comparator<String> comparador = Comparator.comparing(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        });
//        palavras.sort(comparador);


        //Forma Lambda
        palavras.sort(Comparator.comparing(s -> s.length())); //é igual a
        //Forma Method References          //ent   //sai
        palavras.sort(Comparator.comparing(String::length));  //esse

        //Method References faz a mesma coisa que Lambda

        //Forma 2 Method References
        Function<String, Integer> tamanho = String::length;
        Comparator<String> comparador = Comparator.comparing(tamanho);
        palavras.sort(comparador);

        //ForEach Forma Lambda
        palavras.forEach(s -> System.out.println(s));
        //ForEacth Forma Method References
        palavras.forEach(System.out::println);
    }
}
