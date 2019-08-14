package java14.recursos_avancados;
//Streams
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaStreams6 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para leigos", 170));
        cursos.add(new Curso("Lógica de Programação", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

//        List<Curso> resultado = cursos.stream()
//                                .filter(c -> c.getAlunos() >= 100)
//                                .collect(Collectors.toList());
//
//        System.out.println(resultado);

        cursos.stream()
        .filter(c -> c.getAlunos() >= 100)
        .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
        .forEach((nome,alunos) -> System.out.println(nome+" tem "+alunos+" alunos"));

    }

}
