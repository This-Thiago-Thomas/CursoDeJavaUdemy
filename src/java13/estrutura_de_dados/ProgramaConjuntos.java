package java13.estrutura_de_dados;
//Conjuntos

import java.util.LinkedList;
import java.util.Scanner;

/*
Uma das características dos conjuntos é a não aceitação
de elementos repetidos.

Gera perfomance.

A = ["Angelina","Angela","Adriana"]
B = ["Bruno","Barbara","Bianca"]
C = ["Carol","Camila","Cíntia"]
D = ["Daniel","Daniela","Danilo"]
E = ["Elizabeth","Elias","Edilene"]
F = ["Fabio","Fabiana","Fernanda"]
.
.
Z = ["Zelda","Zuleide","Zinha"]
 */
public class ProgramaConjuntos {

    public static void main(String[] args) {
//        LinkedList<String> conjunto = new LinkedList<String>();
//        Scanner leia = new Scanner(System.in);
//        String nome;
//
//        for(int i = 0; i<5; i++){
//            System.out.println("Digite um nome: ");
//            nome = leia.nextLine();
//            if(conjunto.contains(nome)){
//                System.out.println("Erro, já tem esse nome!");
//            }else{
//                conjunto.add(nome);
//                System.out.println("Nome inserido com sucesso!");
//            }
//
//        }
//
//        System.out.println(conjunto);

        ///String nome = "Angelina";

        //int num = 87;

        //System.out.println(nome.toLowerCase().charAt(0) % 26);

        Conjunto cj = new Conjunto();
        cj.adiciona("Amor");
        cj.adiciona("Adriana");
        cj.adiciona("Baixinho");
        cj.adiciona("Coração");
        cj.adiciona("Dado");
        cj.adiciona("Adriana");
        cj.adiciona("Zuleide"); //Não entra repetido
        cj.adiciona("Zuleide"); //Não entra repetido
        cj.remove("Dado");
        cj.remove("Juvenal");

        System.out.println(cj);



    }
}
