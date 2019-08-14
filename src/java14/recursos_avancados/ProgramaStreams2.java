package java14.recursos_avancados;
//Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 Streams são fluxos de dados/objetos utilizados para que possamos
 trabalhar com esses dados de forma mais criteriosa.

 Quando trabalhamos com stream, os métodos aplicados a estre stream
 não afeta a coleção original
 */
public class ProgramaStreams2 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para leigos", 170));
        cursos.add(new Curso("Lógica de Programação", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        //Como fazer para imprimir somente os cursos com mais de 100 alunos
        //cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
        //1 - Transformando a coleção de cursos em stream
        cursos.stream()
        //2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos
        .filter(c -> c.getAlunos() >= 100)
        //3 - Imprimimos o resultado
        .forEach(System.out::println);


    }
}
