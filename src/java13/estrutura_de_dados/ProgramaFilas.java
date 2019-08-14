package java13.estrutura_de_dados;
//Filas

/*
Todos os elementos entram no final da fila.

O primeiro elemento a entrar é tambem o primeiro a sair.

<- [0][1][2][3][4]
*/
public class ProgramaFilas {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.insere("João");
        fila.insere("Maria");
        fila.insere("Pedrita");
        System.out.println(fila);

        String a = fila.getPrimeiro();
        System.out.println("O primeiro da fila é "+a);

        String removido = fila.remove();
        System.out.println(removido + " removido" + "\n" + fila);

        String b = fila.getPrimeiro();
        System.out.println("Agora o primeiro da fila é "+b);

        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        System.out.println(fila.vazia());

    }

}
