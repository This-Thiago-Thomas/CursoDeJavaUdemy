package java13.estrutura_de_dados;

public class ProgramaListaDuplamenteLigadas {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);
        lista.adiciona("Angelina");
        System.out.println(lista);
        lista.adiciona("Maria");
        System.out.println(lista);
        lista.adiciona("Mario");
        lista.adiciona("Mariele");
        lista.remove(2);
        lista.remove(1);
        lista.remove(0);
        System.out.println(lista.contem("Mariele PRESENTIII AAA"));
        System.out.println(lista);
    }
}
