package java12.threads;
//Simulação da geração de relatório + barra de tarefa
// sem a utilização de threads

public class ProgramaThreads {

    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        barra.executa();

        GeraRelatorio gera = new GeraRelatorio();
        gera.executa();
    }
}
