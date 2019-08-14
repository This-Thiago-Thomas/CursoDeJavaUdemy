package java14.recursos_avancados;
//Streams
import java.util.ArrayList;
import java.util.List;

public class ProgramaStreams5 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para leigos", 170));
        cursos.add(new Curso("Lógica de Programação", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        cursos.stream()
        .filter(c -> c.getAlunos() < 1)
        .findAny()  //pega qualquer um de acordo com o filtro
        .ifPresent(System.out::println); //se encontrar algum curso, imprime
    }
}
