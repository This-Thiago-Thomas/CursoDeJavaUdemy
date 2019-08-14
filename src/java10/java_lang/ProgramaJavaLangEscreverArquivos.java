package java10.java_lang;
//Ler e Escrever em Arquivos
//Escrevendo em Arquivos

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ProgramaJavaLangEscreverArquivos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        try {
            //Desta forma, toda vez que o programa for executado,
            //O Arquivo será recriado e toda a informação salva será excluida,
            //recomeçando do zero.

            PrintStream escrever = new PrintStream("Seila.txt");

            for(int i = 0; i < 5; i++) {
                System.out.println("Escreva algo: ");
                String msg = leia.nextLine();
                escrever.println(msg);
            }
            escrever.close();

        }catch(FileNotFoundException e){

            System.out.println("Não foi possivel criar o arquivo");
        }
    }
}