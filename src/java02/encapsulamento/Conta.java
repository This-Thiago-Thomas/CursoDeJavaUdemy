package java02.encapsulamento;

import java.beans.Beans;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta() {

    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void sacar(float valor) {
        if ((this.saldo + this.limite) < valor) {
            System.out.println("Erro! Dinheiro Insuficiente!!");

        } else if (this.saldo < valor) {
            System.out.println("Saque Efetuado, só que vc entrou no Limite");
            float valorTemp = valor - this.saldo;
            this.saldo = 0;
            this.limite -= valorTemp;

        } else {
            System.out.println("Saque Efetuado!");
            this.saldo -= valor;
        }
    }

    //Forma 1 de sincronização
//    public void depositar(float valor) {
//        synchronized (this){
//            this.saldo = this.saldo + valor;
//        }
//
//    }

    //Forma 2 de sincronização
    public synchronized void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public void imprimeDados() {
        System.out.println("Nome do cliente: " + this.cliente.getNome());
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    @Override
    public String toString() {
        return "Conta n°: " + this.numero + "\n" +
                "Saldo:    " + this.getSaldo() + "\n" +
                "Limite:   " + this.limite + "\n" +
                "Cliente:  " + cliente.getNome();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Conta)) {
            return false;
        } else {
            return ((Conta) obj).getSaldo() == this.getSaldo();
        }
    }

}
