package java12.threads;
//Thread Não Sincronizada (Não é estável)
import java02.encapsulamento.Cliente;
import java02.encapsulamento.Conta;
/*
Por padrão, as threads não são sincronizadas. Pode ocorrer problemas
de uma thread acessar o valor de um objeto que ainda não foi atualizado
ou ainda as threads executarem depois depois do valor está impresso
 */
public class ProgramaThreads3 {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("João",20,"rua 01");
        Conta con1 = new Conta(1, 200, 300, cli1);

        FazDeposito acao = new FazDeposito(con1);
        Thread thread1 = new Thread(acao);
        Thread thread2 = new Thread(acao);

        thread1.start(); //500 + 100 -> 600?
        thread2.start(); //600 + 100 -> 700?

        System.out.println(con1);
    }

}
