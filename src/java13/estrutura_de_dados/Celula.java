package java13.estrutura_de_dados;
/**
    Classe que representa uma célula (container) onde
    onde teremos o objeto (valor) e uma celula (próximo)
    que será a ligação para o próximo.
 */
public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento, Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento){
        this(elemento,null);
    }

    public Celula getProximo(){
        return this.proximo;
    }

    public void setProximo(Celula proximo){
        this.proximo = proximo;
    }

    public Object getElemento(){
        return this.elemento;
    }

    public Celula getAnterior(){
        return this.anterior;
    }

    public void setAnterior(Celula anterior){
        this.anterior = anterior;
    }
}
