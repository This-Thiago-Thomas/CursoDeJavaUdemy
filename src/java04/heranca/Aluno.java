package java04.heranca;

public class Aluno extends Pessoa{

    int matricula;

    public Aluno (String nome, int ano_nasc, int matricula){
        super(nome, ano_nasc);
        this.matricula = matricula;

    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public void mensagem(String texto){
        System.out.println("Aluno(a) "+ this.getNome() +" falou: "+texto);
    }

    @Override
    public String toString(){
        return super.toString() + "\nMatricula: " + this.getMatricula();
    }
}
