package java12.threads;
/*
Para executar métodos em paralelo, a nossa classe
deve implementar a interface Runnable, e o método
que precisar ser executado em paralelo dever ser
executado dentro do método run()
 */
public class BarraDeProgresso implements Runnable{

    public void executa(){
        //For 0 até 10 milhões
        for(int i = 0; i < 1000; i++){
            System.out.println("Barra de progresso "+i+"...aguarde");
        }
    }

    @Override
    public void run() {
        this.executa();
    }
}
