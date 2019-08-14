package java13.estrutura_de_dados;
//Pilhas

/*
São estruturas de dados onde o elemento que está visivel/disponivel
é o que está sempre no topo.

Os elementos ao serem adicionado em uma pilha, são adicionados sempre
no topo,

Para remover elementos da pilha, só podemos remover o topo.

O ultimo elemento a entrar é o primeiro a sair.
Last in, First out.
LIFO

[Elemento 6] -> Tem visibilidade
[Elemento 5]
[Elemento 4]
[Elemento 3]
[Elemento 2]
[Elemento 1]
 */
public class ProgramaPilhas {

    public static void main(String[] args) {
        Pilha paulo_guina = new Pilha();

        paulo_guina.insere("Jailson Mendes");
        paulo_guina.insere("da o cu pra vi vá");
        paulo_guina.insere("vou deixar um oco nese rabo");
        System.out.println(paulo_guina);
        paulo_guina.remove();
        paulo_guina.insere("O problema é na mangueira!");
        System.out.println(paulo_guina);
        System.out.println(paulo_guina.getTopo());
    }
}
