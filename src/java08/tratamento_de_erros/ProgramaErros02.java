package java08.tratamento_de_erros;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaErros02 {

    public static void main(String[] args) throws InputMismatchException {

        try {
            Scanner leia = new Scanner(System.in);

            System.out.println("Informe o n1: ");
            int n1 = leia.nextInt();

            System.out.println("Informe o n2: ");
            int n2 = leia.nextInt();

            try {
                System.out.println("A divisão de " + n1 + " por " + n2 + " é " + divisao(n1, n2));
            } catch (ArithmeticException e) {
                System.out.println("Erro Exception!");
            }
        }catch(InputMismatchException e){
            System.out.println("Valor incorreto, digite novamente!");
        }
    }

    //Estou criando uma função que avisa que tem possibilidade
    //de lançar uma exceção do tipo Exception

    public static int divisao(int n1, int n2) throws ArithmeticException{
        return n1 / n2;
    }
}
