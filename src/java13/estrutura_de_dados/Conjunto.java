package java13.estrutura_de_dados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
0 -> a
1 -> b
.
.
.
25 -> z
 */

public class Conjunto {
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public Conjunto(){
        for(int i = 0; i < 26; i++){
            tabela.add(new LinkedList<String>());
        }
    }

    private int calculaIndice(String nome){
        return nome.toLowerCase().charAt(0) - 97;
    }

    public void adiciona(String nome){
        //1 - Verifica se o nome ja está na lista
        if(this.contem(nome)){
            System.out.println("Erro!, o nome "+nome+" já está na lista");
        }else {
            //2 - Calculando o índice do nome
            int indice = calculaIndice(nome);
            //3 - Pegando a lista de acordo com o indice
            List<String> lista = tabela.get(indice);
            //4 - Adiciona o nome da lista correta
            lista.add(nome);
        }
    }

    private boolean contem(String nome){
        //1 - Calculando indice do nome
        int indice = calculaIndice(nome);
        //2 - Buscando na tabela especifica do índice o nome;
        return tabela.get(indice).contains(nome);
    }

    public void remove(String nome){
        //Verificamos se o nome existe em alguma lista
        if(!this.contem(nome)){
            //Se não enviamos a mensagem informando
            System.out.println("Erro, não existe nenhum(a) "+nome+"!");
        }else{
            //Calculamos o indice do nome
            int indice = calculaIndice(nome);
            //Removemos o nome da lista
            tabela.get(indice).remove(nome);
            System.out.println("O nome "+nome+" foi removido com sucesso!");
        }
    }

    @Override
    public String toString() {
        StringBuilder tudo = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char letra = (char)(i+65);
            tudo.append(letra+" = "+tabela.get(i) +  "\n");
        }
        return tudo.toString();
    }
}
