package java04.heranca;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public Funcionario (String nome, int ano_nascimento, String setor, boolean trabalhando){
        super(nome, ano_nascimento);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    @Override
    public void mensagem(String texto){
        System.out.println(texto);
    }
}
