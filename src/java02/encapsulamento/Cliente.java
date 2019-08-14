package java02.encapsulamento;

public class Cliente implements Comparable{
    private String nome;
    private int idade;
    private String endereco;

    public Cliente(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Nome:     " + this.getNome() + "\n" +
               "Endereco: " + this.endereco;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = ((Cliente)outro);
        if(this.idade < aux.idade){
            return -1;
        }else if(this.idade > aux.idade){
            return 1;
        }else{
            return 0;
        }

    }
}
