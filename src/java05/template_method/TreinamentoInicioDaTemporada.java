package java05.template_method;

public class TreinamentoInicioDaTemporada extends Treinamento {

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico da galera de ressaca do ano novo kk");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino apatico e sem graca de inicio");
    }
}
