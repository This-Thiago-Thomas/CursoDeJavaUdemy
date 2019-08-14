package java11.colecoes;
/*
Arrays (Vetores/Matrizes)

- Um array tem tamanho fixo. Ou seja, se criarmos um array
com 5 elementos, ele terá sempre no máximo 5 elementos.

- Um array tem tipo de dado fixo. Ou seja, se criarmos um
array de inteiros, ele só podera ter inteiros.

- É dificil encontrar um determinar elemento em um array.
Precisamos para isso, percorrer totalmente o array através
do seu indice
*/


/*
Colections (Coleções)

-  Java possui diversas classes/interfaces que facilitam
muito o trabalho quando se trata de coleções de dados.
Essas classes/interfaces são chamadas de Collections.
*/

import java.util.ArrayList;
import java.util.Collections;

/*
Listas

- Aceitam repeticao de valores;
- Possuem tamanho 'infinito' (Depende da memória);
- Podemos adicionar valores de qualquer tipo, desde de que não
especificamos um tipo na declaração;
 */
public class ProgramaListas {

    public static void main(String[] args) {
        //ArrayList nomes = new ArrayList(); //Sem definir tipo de dado, podemos colocar qualquer tipo
        ArrayList<String> nomes = new ArrayList<String>(); //Definimos o tipo String

        nomes.add("Maria"); //0
        nomes.add("Carly");
        nomes.add("Sam");   //2
        nomes.add("Geek");
        nomes.add("Mary");  //4

        /*
        nomes.add(87);
        nomes.add(true);
        nomes.add(12.4);
        nomes.add('e');
         */

        //System.out.println(nomes.size());

        /*for(int i = 0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

         */

        Collections.sort(nomes);


        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
