package java07.meth_e_atrb_estaticos;


public class ProgramaAtbEst{

    public static void main(String[] args) {
        Conta c1 = new Conta("Hong 10");
        Conta c2 = new Conta("Lilou");
        Conta c3 = new Conta("Pelezinho");
        System.out.println(c1.getCliente());
        System.out.println(c2.getCliente());
        System.out.println(c3.getCliente());
        //  System.out.println(Conta.contador);
    }

}
