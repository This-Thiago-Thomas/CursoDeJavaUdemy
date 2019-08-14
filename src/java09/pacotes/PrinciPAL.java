package java09.pacotes;

import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;
import java.util.Scanner;

/*

Gerando executáveis jar

JAR - Java Archive

Java Archive - Arquivo Compactado Java
como o zip/rar

 */
public class PrinciPAL {

    static Cliente cliente = new Cliente("Luci Liu", 25,"Rua da paz");
    static Conta conta = new Conta(1,100,300,cliente);
    static Scanner leia = new Scanner(System.in);

    public static void depositar(){
        System.out.println("===============DEPÓSITO===============");
        System.out.println("Informe o valor para depósito: ");
        float valor = leia.nextFloat();
        if(valor > 0){
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso.");
        }else{
            System.out.println("O Valor precisa ser inteiro");
        }
    }


    public static void sacar(){
        System.out.println("===============SAQUE=================");
        System.out.println("Informe o valor para saque: ");
        float valor = leia.nextFloat();
        if(valor>0){
            conta.sacar(valor);
        }else {
            System.out.println("O Valor precisa ser inteiro!!");
        }
    }

    public static void consultar(){
        conta.imprimeDados();
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Bem Vindo ao Banco Gik");

        do{

            System.out.println("Selecione uma opcao abaixo: ");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - consultar saldo");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch (opcao){

                case 1:
                    depositar();
                    break;

                case 2:
                    sacar();
                    break;

                case 3:
                    consultar();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Numero incorreto!");
                    break;

            }


        }while (opcao > 0);
    }

}
