package java14.recursos_avancados;
//Revisão

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
- Classes anônimas;
- Lambdas
- Method References
 */
public class ProgramaStreams {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para leigos", 170));
        cursos.add(new Curso("Lógica de Programação", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        //cursos.sort(Comparator.comparing(c -> c.getAlunos()));//Lambdas
        cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method References

        //cursos.forEach(c -> System.out.println(c.getNome())); //Lambdas
        cursos.forEach(System.out::println); //Method References
    }

}
