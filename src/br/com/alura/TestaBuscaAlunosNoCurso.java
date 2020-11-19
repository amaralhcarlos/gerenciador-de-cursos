package br.com.alura;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 20));
        javaColecoes.add(new Aula("Modelando com Coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Maurício Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        //javaColecoes.estaMatriculado()
        int matriculaBuscada = 5617;
        System.out.println(String.format("Quem é o aluno com matrícula %s? ", matriculaBuscada));
        Aluno aluno = javaColecoes.buscaMatriculado(matriculaBuscada);

        if (Objects.nonNull(aluno)) {
            System.out.println("O aluno da matrícula é o " + aluno);
        } else {
            System.out.println("Nenhum aluno possui essa matrícula");
        }

    }

}
