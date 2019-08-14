package java01.poo;

public class ProgramaPoo {

    static void imprimirProduto(Produto p){
        System.out.println("===========Produto============");
        System.out.println("Nome: " + p.nome);
        System.out.println("Preço: "+ p.preco);
        System.out.println("Desconto: "+ p.desconto);
    }

    public static void main(String[] args){

        Produto prod1, prod2;

        prod1 = new Produto("Notebook",1000,10);
        prod2 = new Produto("Caneta Bic",2.45f,5);

        imprimirProduto(prod1);
        System.out.println("");
        prod1.descontar();
        imprimirProduto(prod1);

    }

}
