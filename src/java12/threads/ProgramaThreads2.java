package java12.threads;
//Simulação da geração de relatório + barra de tarefa
// com a utilização de threads

public class ProgramaThreads2 {

    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread thread1 = new Thread(barra);
        thread1.start();

        GeraRelatorio gera = new GeraRelatorio();
        Thread thread2 = new Thread(gera);
        thread2.start();

    }
}
