package java01.poo;

public class Produto {

    String nome;
    float preco;
    float desconto;

    public Produto(String nome, float preco, float desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    void descontar(){
        float desc = desconto / 100;
        preco = preco - (preco * desc);
    }

}
