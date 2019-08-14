package java08.tratamento_de_erros;
//Tratando exceções com try/catch

/*

Utilizamos o try para tentar realizar algo, geralmente aquilo que
pode acarretar em um problema.

Utilizamos o catch para capturar o erro e com isso ofecer ao usuario
do sistema uma mensagem adequada sem que o sistema quebre.

*/

public class ProgramaErros{



    public static void main(String[] args) {
        int numeros[] = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3 * 2;
        }

        for(int i = 0; i <= numeros.length; i++){
            try {
                System.out.println(numeros[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro!, vc passou do vetor!! ");
            }

        }


    }
}
