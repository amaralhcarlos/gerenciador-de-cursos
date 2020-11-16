package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {


        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.add(new Aula("Criando uma Aula",20));
        javaColecoes.add(new Aula("Modelando com Coleções",24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        //Collections.sort(aulasImutaveis); -> NÃO FUNCIONA!!
        System.out.println(aulasImutaveis);

        /*O melhor jeito de ordenar uma unmodifiable list seguindo algum critério é nos aproveitarmos da
         possibilidade de poder *passar a unmodifiable list no construtor de uma ArrayList tradicional* ,
         podendo assim utilizar o método .sort() de Collections.
         */
        List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);


    }
}
