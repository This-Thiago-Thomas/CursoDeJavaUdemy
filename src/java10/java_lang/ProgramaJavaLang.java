package java10.java_lang;
//Object: A Mãe de todas as classes

import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;

/*
A classe Object, faz parte do pacote java.lang
*/
public class ProgramaJavaLang{

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("joana", 25,"rua tatici");
        Cliente cl2 = new Cliente("joao",  19, "rua cordislandia");

        Conta c1 = new Conta(1, 200, 300, cl1);
        Conta c2 = new Conta(2, 200, 300, cl2);

        Caixa cx = new Caixa();

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);

        if(c1.equals(cl1)){
            System.out.println("São a mesma conta");
        }else{
            System.out.println("São contas diferentes");
        }

        cx.adicionar(c1); //0 - tem getSaldo();
        cx.adicionar(c2); //1 - tem getSaldo();

        //Conta contacx1 = cx.pegar(0);

        System.out.println(((Conta)cx.pegar(0)).getSaldo());//Cast

        cx.adicionar(cl1); //2 - não tem getSaldo();

        System.out.println(((Cliente)cx.pegar(2)).getNome());//Cast

        System.out.println();

        System.out.println(cx.pegar(0));

        System.out.println();

        System.out.println(cx.pegar(1));

        System.out.println();

        System.out.println(cx.pegar(2));

    }

}