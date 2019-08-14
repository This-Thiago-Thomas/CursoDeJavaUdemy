package java14.recursos_avancados;

/*
A gente está criando nosso pŕoprio comparador de objetos (Strings)
para que seja possível, desta forma, ordenar a string pelo tamanho
ao invés da ordem alfabética

1- A string1 é menor que a string2 -> retornamos -1
2- A string1 é maior que a string2 -> retornamos 1
3- A string1 tem o mesmo tamanho string2 -> retornamos 0
 */

import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()){
            return -1;
        }else if(s1.length() > s2.length()){
            return 1;
        }else {
            return 0;
        }
    }
}
