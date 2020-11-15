package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Aumentando nosso conhecimento";

        List<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println(aulas.toString());

        aulas.remove(aula2);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }


        Collections.sort(aulas);

        aulas.forEach(aula -> {

            System.out.println("Aula (via lambda) " + aula);

        });


    }
}
