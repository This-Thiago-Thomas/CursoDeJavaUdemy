package java11.colecoes;
//Mapas / Map

/*
Os mapas são representados em Java pela interface Map
e mapeia seus elementos utilizando o conteito de chave / valor;

- Mapas são conhecidos como se fosses/representassem 3 coleções
    - Coleção de chaves;
    - Coleção de valores;
    - Coleção de associações;
*/


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProgramaMapas {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(21,"João");
        pessoas.put(31,"Maria do carmo");
        pessoas.put(51,"Daiane dos Santos");

        //Coleção de chaves
        System.out.println("Chaves: " + pessoas.keySet());  //Gera um conjunto

        //Coleção de valores
        System.out.println("Valores: " + pessoas.values()); //Gera uma coleção

        //Coleção de associações
        System.out.println("Assosiações: " + pessoas.entrySet());


        //Iterar na coleção de chaves:
        //Forma de Iterar 1
        Set<Integer> chaves = pessoas.keySet();
        for(Integer idade : chaves){
            System.out.println(pessoas.get(idade));
        }
        //Forma de Iterar 2
        //Disponibilizado a partir do Java 8
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });



        //Iterar na coleção de valores:
        //Forma 1
        Collection<String> valores = pessoas.values();
        for(String valo: valores){
            System.out.println(valo);
        }
        //Forma 2
        pessoas.values().forEach(valor ->{
            System.out.println(valor);
        });



        //Iterar a coleção de associações:
        //Forma 1
        Set<Entry<Integer, String >> associacoes = pessoas.entrySet();
        for(Entry<Integer, String> associacao: associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        //Forma 2
        pessoas.entrySet().forEach(assosi -> {
            System.out.println(assosi.getKey() + "-" + assosi.getValue());
        });

    }

}
