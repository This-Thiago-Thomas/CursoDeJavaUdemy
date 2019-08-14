package java13.estrutura_de_dados;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    /**
     * método que adiciona um objeto no comeco lista
     * @param elemento
     */
    public void adicionaNoComeco(Object elemento){
        if(this.total == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else{
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }

    /**
     * método que adiciona um objeto no fim da lista;
     * @param elemento
     */
    public void adiciona(Object elemento){
        if(total == 0){
            this.adicionaNoComeco(elemento);
        }else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);  //<- objeto ->
            this.ultima = nova;
            this.total++;
        }

    }

    /**
     * Método que adiciona um elemento no meio da lista,
     * de acordo com a posição.
     *
     * @param posicao
     * @param elemento
     */
    public void adiciona(int posicao, Object elemento){
        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        }else if(posicao == this.total) {
            this.adiciona(elemento);
        }else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            nova.setAnterior(anterior);
            proxima.setAnterior(nova);
            this.total++;
        }
    }

    /**
     * Método para pegar o elemento pela posicao
     * @param posicao
     * @return
     */
    public Object pega(int posicao){
        Celula pegar = this.pegaCelula(posicao);
        return pegar.getElemento();
    }


    public void remove(int posicao){
        if(posicao == 0){
            this.removeDoComeco();
        }else if(posicao == this.total-1){
            this.removeDoFim();
        }else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = this.pegaCelula(posicao + 1);
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }

    public void removeDoFim(){
        if(this.total <= 1){
            this.removeDoComeco();
        }else{
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.total--;
        }
    }
    /**
     * Remove o primeiro item da lista
     */
    public void removeDoComeco(){
        if(this.total == 0){
            throw new IllegalArgumentException("Lista Vazia");
        }else{
            this.primeira = this.primeira.getProximo();
            this.total--;

            if(this.total == 0){
                this.ultima = null;
            }
        }
    }

    /**
     * Retorna o tamanho da lista
     */
    public int tamanho(){
        return this.total;
    }

    public boolean contem(Object obj){
        for(int i = 0; i < this.total; i++){
            if(this.pega(i).equals(obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if(total == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < total; i++){
            builder.append(atual.getElemento());
            builder.append("][");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >=0 && posicao < this.total;
    }

    private Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao inexistente");
        }
        Celula atual = this.primeira;

        for(int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

}