package java13.estrutura_de_dados;

import java.util.Stack;

//Pilhas - Implementação do Java
public class ProgramaPilhasJava {

    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        System.out.println(nomes);

        //Push é o Insere/Adiciona
        nomes.push("Jailson");
        nomes.push("Bioca");
        nomes.push("Guina");

        //Peek retorna o topo
        String topo = nomes.peek();

        System.out.println("O topo agora é "+topo);

        nomes.push("Galo");

        //Pop remove do inicio e retorna
        String removido = nomes.pop();

        System.out.println("O removido foi "+removido);

        System.out.println(nomes);

        //Empty verifica se está vazia
        System.out.println(nomes.empty());
    }

}
