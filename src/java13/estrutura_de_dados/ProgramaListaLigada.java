package java13.estrutura_de_dados;
//Lista Ligada / LinkedList

/*
Em um vetor, os elementos estão um do lado do outro. Ex: [1][2][3][4]

Enquanto em uma lista ligada eles estão/ou podem estar em lugares diferentes,
porém um aponta para o outro, indicando o próximo elemento.
*/

public class ProgramaListaLigada {
    public static void main(String[] args) {
        //Implementando a lista
        ListaLigada lista = new ListaLigada();

        //Teste método adicionar no começo
        lista.adicionaNoComeco("Maria");
        System.out.println(lista);
        lista.adicionaNoComeco("Gilvana");
        System.out.println(lista);
        lista.adicionaNoComeco("Joana");
        System.out.println(lista);
        int numero = 42;
        lista.adicionaNoComeco(numero);
        System.out.println(lista);

        //Teste método adicionar no final
        lista.adiciona(20);
        System.out.println(lista);
        lista.adiciona("Maria");
        System.out.println(lista);

        //Teste método na posicao desejada
        lista.adiciona(4,"João");
        System.out.println(lista);

        //Teste método pegar
        System.out.println(lista.pega(2));

        //Teste método tamanho
        System.out.println(lista.tamanho());

        //Teste método remove do começo
        lista.removeDoComeco();
        System.out.println(lista);



    }
}
