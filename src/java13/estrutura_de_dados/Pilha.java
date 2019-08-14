package java13.estrutura_de_dados;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<String>();

    //Em uma pilha, inserimos elementos sempre no topo
    public void insere(String nome){
        this.nomes.add(0,nome);
    }

    //Em uma pilha, removemos sempre o elemento no topo
    public String remove(){
        try {
            return nomes.remove(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro, Lista Vazia!");
            return null;
        }
    }

    public int tamanho(){
        return nomes.size();
    }

    public boolean vazia(){
        return nomes.isEmpty();
    }

    public String getTopo(){
        return nomes.get(0);
    }
    @Override
    public String toString(){
        return this.nomes.toString();
    }
}
