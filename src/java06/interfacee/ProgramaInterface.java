package java06.interfacee;

/*
    Interface: são conhecidas como "contratos";

    Uma empresa critou um contrato 'com regrras' para definir
    a criação de um produto/serviço

	Quem implementar este contrato, é obrigado a seguir as regras!!!

	João criou um produto baseado nesse contrato.
	Maria tambem criou um produto baseado nesse contrato.

	Exemplo:
	Contrato para a confecção do bolo.
		- o bolo precisa ser de chocolate;
		- ''      ''     ter cobertura;
		- ''      ''     ser recheado;
 */
public class ProgramaInterface{

    public static void main(String[] args){

        Celular celu = new Celular();
        celu.ligar();
        celu.ligar();
        celu.desligar();
        celu.desligar();

    }

}
