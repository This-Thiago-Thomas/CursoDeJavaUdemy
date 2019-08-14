package java11.colecoes;
//HashMap

/*
A classe HashMap implementa a interface Map e trabalha com
o conceito de chave/valor

- Não aceita chave duplicados, ou seja, a chave é unica e corresponde a o item
- Relação Key / Item
*/

import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;
import java.util.HashMap;
import java.util.Map;

public class ProgramaHashMap {

    public static void main(String[] args) {

        Map<Integer, Conta> contas = new HashMap<Integer, Conta>();

        Cliente cli1 = new Cliente("João",17, "rua 01");
        Cliente cli2 = new Cliente("Pedro",25,"rua 02");
        Cliente cli3 = new Cliente("Rebeca", 19, "rua meu core");

        Conta con1 = new Conta(1,250,300, cli1);
        Conta con2 = new Conta(2, 250, 300,cli2);
        Conta con3 = new Conta(3,10000, 50000,cli3);

        contas.put(1, con1);
        contas.put(2, con2);
        contas.put(3, con3);

        System.out.println(contas.size());

        System.out.println(contas.get(1));
        //System.out.println(contas.get(2));
        //System.out.println(contas.get(3));

        //System.out.println(contas.values());

    }




}
