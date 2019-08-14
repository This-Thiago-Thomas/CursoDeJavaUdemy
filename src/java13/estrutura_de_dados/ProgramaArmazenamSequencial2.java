package java13.estrutura_de_dados;

public class ProgramaArmazenamSequencial2 {

    public static void main(String[] args) {

        Vetor lista = new Vetor();

        for(int i = 0; i < 200; i++){
            Aluno a = new Aluno("Maria "+i);
            lista.adiciona(a);
        }

        //lista.adiciona(new Aluno("Josefa"));

        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.tamanhoVetor());

    }
}
