package java10.java_lang;
//Caixa de objetos genéricos


import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;

public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100];// até 100 objetos, 0..99
        posicaoLivre = 0;
    }

    public void adicionar(Object nova){
        this.objetos[posicaoLivre] = nova;
        posicaoLivre++;
    }

    public Object pegar(int posicao){
        return this.objetos[posicao];
    }

    public void oqEh(int posicao) {
        if (this.pegar(posicao) instanceof Conta) {
            System.out.println("é uma conta!");
        }else if(this.pegar(posicao) instanceof Cliente){
            System.out.println("é um cliente!");
        }
    }
}
