package java11.colecoes;

import java02.encapsulamento.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramaListas3 {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c1 = new Cliente("Maria Palma", 18,  "rua 007");
        Cliente c2 = new Cliente("Florentina", 77, "rua 080");
        Cliente c3 = new Cliente("Angelica", 27, "rua 007");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Collections.sort(clientes);

        for(Cliente cli : clientes){
            System.out.println(cli + "\n");
        }

    }
}
