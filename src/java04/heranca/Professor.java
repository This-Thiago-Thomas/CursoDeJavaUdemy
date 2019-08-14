package java04.heranca;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public Professor(String nome, int ano_nasc, String especialidade, float salario){
        super(nome, ano_nasc);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String especial){
        this.especialidade = especial;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    @Override
    public void mensagem(String texto){
        System.out.println("Professor(a) "+ this.getNome() +" falou: "+texto);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: "+this.getEspecialidade() +
                "\nSalário: "+ this.getSalario();
    }
}
