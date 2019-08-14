package java13.estrutura_de_dados;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aux = (Aluno)obj;
        return aux.getNome().equals(this.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
