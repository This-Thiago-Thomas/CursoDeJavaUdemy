package java14.recursos_avancados;
//Lambdas

/*
Expressões lambdas são funções anonimas, ou seja, funções sem nome.

Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais(que só possui um metodo para implementação).

Devemos então criar uma função lambda compatível com a função da interface
que estivermos utilizando

Por exemplo:

- A interface consumer, possui um método que recebe uma string e não retorna
nada, por isso foi possível utilizar a expressão lambda que passa uma string
como parâmetro e não retorna nada

- A função compare, espera receber dois parâmetros do tipo string como entrada
e retorna como inteiro. Por isso foi possível passar a expressão lambda
informando as 2 strings s1 e s2, e utilizando a classe Integer.compare que
retorna um inteiro

- A função lambda tem que ser COMPATÍVEL com a interface que a função espera.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProgramaLambdas2 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Florentina");

        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.forEach(s -> System.out.println(s));

        Consumer<String> consumer = s -> System.out.println(s);
        palavras.forEach(consumer);



    }
}
