package java02.encapsulamento;

public class ProgramaEncapsu {

    public static void main(String[] args){

        Cliente joao = new Cliente("Joao da silva", 18, "Rua da paz");
        //	Cliente maria = new Cliente("Maria da silva","Rua da paz, 45");

        Conta conta1 = new Conta(1, 100, 200, joao);
        //	Conta conta2 = new Conta(2, 300, 500, maria);

	/*	conta1.saldo = 150;
		conta1.limite = 500;

	  	conta1.imprimeDados();

		conta2.imprimeDados();
	*/

        System.out.println("Antes");
        //	System.out.println("Saldo da Maria Antes: "+conta2.getSaldo());
        conta1.imprimeDados();
        System.out.println();
        conta1.sacar(150);
        //	conta2.depositar(22);
        System.out.println();
        System.out.println("Depois");
        //	System.out.println("Saldo da Maria Depois: "+conta2.getSaldo());
        conta1.imprimeDados();
	/*	conta1.setSaldo(-9000);

		System.out.println("Saldo do João Depois do depois: "+conta1.getSaldo());
	*/

    }
}
