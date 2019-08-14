package java07.meth_e_atrb_estaticos;

/*
Um método estático, não depende da instancia de uma
classe para ser utilizado.

Pode-se utilizar conforme:
NomeDaClasse.método();

*/

public class ProgramaMetEst {

    public static void main(String[] args) {
        int soma = Conta.soma(5, 5);
        System.out.println(soma);

        Conta c1 = new Conta("Cliente");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());
        System.out.println("A Proxima conta será " +Conta.proximaConta());
    }

}
