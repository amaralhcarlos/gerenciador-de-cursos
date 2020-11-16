package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {


        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.add(new Aula("Criando uma Aula",20));
        javaColecoes.add(new Aula("Modelando com Coleções",22));

        System.out.println(javaColecoes.getAulas());


    }
}
