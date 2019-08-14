package java03.encapsulamento2;

import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;

public class ProgramaEncapsu2 {
    public static void main(String[] args){
        	Cliente a = new Cliente("João", 20,  "Tatici");
        	Conta aa = new Conta(88,10,100,a);

        	aa.imprimeDados();
    }

}
