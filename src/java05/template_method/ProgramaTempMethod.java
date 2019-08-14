package java05.template_method;

public class ProgramaTempMethod {

    public static void main(String[] args){

        TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
        tit.treinoDiario();

        System.out.println();

        TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
        tft.treinoDiario();
    }
}
