package java13.estrutura_de_dados;
//Armazenamento sequencial

/*
int numeros[] = new int[5];

numeros[0] = 1;
numeros[1] = 3;
numeros[2] = 5;
numeros[3] = 7;
numeros[4] = 9;
*/
public class ProgramaArmazenamSequencial {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Hong10");
        Aluno a2 = new Aluno("Felicity");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);

        Aluno a3 = new Aluno("Pedrita");

        lista.remove(0);
        lista.adiciona(5,a3);

        System.out.println(lista);

        lista.adiciona(5, new Aluno("oie!!")); //errito rsrs, mas de boas

        System.out.println(lista);
    }
}
