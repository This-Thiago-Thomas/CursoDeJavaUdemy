package java07.meth_e_atrb_estaticos;

public class Conta {

    private int numero;
    private String cliente;

    private static int contador = 1;

    public Conta(String cliente){
        this.numero = contador;
        this.cliente = cliente + " " + contador;
        Conta.contador++;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int proximaConta(){
        return Conta.contador;
    }
}
