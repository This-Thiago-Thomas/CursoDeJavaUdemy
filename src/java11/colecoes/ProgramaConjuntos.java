package java11.colecoes;

//Conjuntos

/*
Os conjuntos são implementados com a interface
Set, e uma das classes que implementam esta
interface é a HashSet

A Maioria das coleções possuem os mesmos métodos
ja conhecidos e utilizados com as listas, mas
o comportamento desses objetos é um pouco dife-
rente,

A performance é melhor em conjuntos do que
listas

Caracteristicas dos conjuntos:
- Não aceitam valores repetidos;
- A ordem de inserção não é respeitada (Realiza
uma semi ordenação )
- Não aceitam ordenação;
- Não possui índice;
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaConjuntos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Set<String> nomes = new HashSet<String>();

        /*
        nomes.add("Maria");     //0
        nomes.add("Pedro");     //1
        nomes.add("Thiago");    //2
        nomes.add("Positivo");  //3
        nomes.add("Magrão");    //4
        nomes.add("Thiago");    //5  Conjuntos não aceitam repetição de valores
         */

        for(int x = 0; x < 5; x++){
            System.out.println("Digite um nome: ");
            boolean valeu = nomes.add(leia.nextLine());
            if(!valeu){
                System.out.println("Esse nome ja tem na lista");
            }else{
                System.out.println("Nome inserido na lista com sucesso!!!");
            }
        }

        System.out.println("Os nomes que estão na lista são: ");

        for(String nome : nomes){
            System.out.println(nome);
        }

        leia.close();

        //System.out.println(nomes.size());

        //System.out.println(nomes.contains("thiago"));

        //Collections.sort(nomes);

        //System.out.println(nomes.contains("Maria"));

        /*
        for(String kk : nomes){
            System.out.println(kk);
        }
         */


    }




}
