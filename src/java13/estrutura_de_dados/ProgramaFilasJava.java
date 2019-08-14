package java13.estrutura_de_dados;
//Fila - Implementação do Java

/*
Queue é uma classe abstrata, e para implementar na fila,
é preciso criar um novo linkedlist nela.
 */

import java.util.LinkedList;
import java.util.Queue;

public class ProgramaFilasJava {

    public static void main(String[] args) {
        Queue<String> fila_do_pao = new LinkedList<String>();

        System.out.println(fila_do_pao);

        //Add é o inserir
        fila_do_pao.add("Dona Maria");
        fila_do_pao.add("Seu Zé");
        fila_do_pao.add("Dona Zefinha");

        System.out.println("fila do pao :"+fila_do_pao);

        //Poll é o remover
        String vazou = fila_do_pao.poll();
        System.out.println(vazou+" ja pegou o pao e foi embora");
        System.out.println("E a fila ficou assim:" + "\n" + fila_do_pao);

        System.out.println(fila_do_pao.element());
        System.out.println(fila_do_pao.peek());


    }

}
