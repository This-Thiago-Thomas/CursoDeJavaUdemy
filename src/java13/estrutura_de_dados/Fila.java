package java13.estrutura_de_dados;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome){
        this.nomes.add(nome);
    }

    public String remove(){
        try {
            return this.nomes.remove(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro!, Fila Vazia!");
            return null;
        }
    }

    public String getPrimeiro(){
        try {
            return this.nomes.get(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro!, Fila Vazia!");
            return null;
        }
    }

    public boolean vazia(){
        return this.nomes.isEmpty();
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
