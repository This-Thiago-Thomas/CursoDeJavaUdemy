package java04.heranca;

public abstract class Pessoa {

    private String nome;
    private int ano_nascimento;

    public Pessoa(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_Nascimento() {
        return this.ano_nascimento;
    }

    public void setAno_Nascimento(int anoNascimento){
        this.ano_nascimento = anoNascimento;
    }

    @Override
    public String toString(){
        return "Nome: "+this.getNome() + "\nAno de nascimento: "+this.getAno_Nascimento();
    }

    public abstract void mensagem(String texto);
}
