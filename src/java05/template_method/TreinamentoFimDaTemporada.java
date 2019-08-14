package java05.template_method;

public class TreinamentoFimDaTemporada extends Treinamento {

    @Override
    public void preparoFisico(){
        System.out.println("Preparo fisico, bora porra, vamo cair nao carai!!");
    }

    @Override
    public void jogoTreino(){
        System.out.println("Jogo Treino, do tipo, foco carai pq se cai fudeu kkkk");
    }
}
