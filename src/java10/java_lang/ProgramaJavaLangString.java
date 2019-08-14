package java10.java_lang;

//Trabalhando com Strings

/*
Em Java, String são imutáveis, ou seja, não mudam.

String são nada mais que: Vetor de Caracteres
 */
public class ProgramaJavaLangString {

    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";

        //curso = curso.replace("a", "o");//Altera na string, se encontrar, a primeira palavra pela segunda

        curso = curso.toLowerCase(); //Converte tudo para minusculas
        curso = curso.toUpperCase(); //Converte tudo para maiuscula

        curso.charAt(0); //Posicao do vetor que se encontra a String

        System.out.println(curso.charAt(0));

        //for(int i = 0; i < curso.length(); i++){
        //    System.out.println(curso.charAt(i));
        //}

        for(int i = curso.length()-1; i >=0; i--){
            System.out.println(curso.charAt(i));
        }

    }

}
