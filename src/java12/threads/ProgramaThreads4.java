package java12.threads;
//Thread Sincronizada

/*
O sincronismo ocorre pois durante a execução do método a thread
exeuta um 'lock' (bloqueio) da função para que outra thread
só possa executá-la pós a finalização da thread inicial
 */
import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;

public class ProgramaThreads4 {

    public static void main(String[] args) throws InterruptedException{
        Cliente cli1 = new Cliente("João",20,"rua 01");
        Conta con1 = new Conta(1, 200, 300, cli1);

        FazDeposito acao = new FazDeposito(con1);
        Thread thread1 = new Thread(acao);
        Thread thread2 = new Thread(acao);

        thread1.start(); //500 + 100 -> 600?
        thread2.start(); //600 + 100 -> 700?

        thread1.join(); //avisando que a thread thread1 deve 'se juntar' a um sicronizador
        thread2.join(); //avisando que a thread thread2 deve 'se juntar' a um sicronizador

        System.out.println(con1);
    }
}
