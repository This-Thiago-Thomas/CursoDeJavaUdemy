package java11.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaListas2 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(87);
        numeros.add(2);
        numeros.add(23);
        numeros.add(44);
        numeros.add(17);

        Collections.sort(numeros);

        //System.out.println(numeros.get(0));

        for(int x : numeros){
            System.out.println(x);
        }
    }
}
