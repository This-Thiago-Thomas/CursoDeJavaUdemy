package java10.java_lang;

//Escrevendo os Arquivos com mais coisas


import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ProgramaJavaLangEscreverAMais {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        try {

            PrintStream escrever = new PrintStream(new FileOutputStream("Seila.txt",true));

            for (int i = 0; i < 5; i++) {
                System.out.println("Escreva algo: ");
                String msg = leia.nextLine();
                escrever.println(msg);
            }
            escrever.close();

        } catch (FileNotFoundException e) {

            System.out.println("Não foi possivel criar o arquivo");
        }

    }
}
