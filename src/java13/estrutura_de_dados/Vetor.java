package java13.estrutura_de_dados;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int qtdAlunos = 0;

    public void adiciona(Aluno aluno){
        this.garantirEspaco();
        this.alunos[qtdAlunos] = aluno;
        qtdAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantirEspaco();
        for(int i = qtdAlunos - 1;  i>= posicao; i--){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        qtdAlunos++;
    }

    public Aluno pega(int posicao){
        try {
            return this.alunos[posicao];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posiçao Inválida");
            return null;
        }
    }

    public void remove(int posicao){
        for(int i = posicao; i < this.qtdAlunos; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        qtdAlunos--;
    }

    public boolean contem(Aluno aluno){
        for (Aluno value : alunos) {
            if (aluno.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.qtdAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);//facilita a visualização do array
    }

    private void garantirEspaco(){
        //Verifica se o array alunos está cheio
        if(qtdAlunos == alunos.length){
            //Caso esteja cheio, cria um novo array como o dobro de tamanho do array anterior
            Aluno novoArray[] = new Aluno[alunos.length*2];
            //Copia os dados do array anterior para o novo array
            for(int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            //Por último, atribuimos o novo array ao array original
            this.alunos = novoArray;
        }
    }

    public int tamanhoVetor(){
        return this.alunos.length;
    }
}
