package java04.heranca;

public class ProgramaHeranca {

    public static void main(String[] args){
    //  Não pode ser instanciado pois é uma classe abstrata,
    //  só serve como modelo!!
    //  Pessoa p = new Pessoa("Joao",2001);
        Aluno maria = new Aluno("Maria da Silva",1992,1);
        Funcionario jose = new Funcionario("Jose Silva",1967, "limpeza",false);
        Professor france = new Professor("Tia France",1977,"Matemática",4000);
        System.out.println(france);

    }
}
