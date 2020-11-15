package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

    public static void main(String[] args) {


        Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
        Aula aula2 = new Aula("Listas de Objetos", 19);
        Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 17);

        List<Aula> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        System.out.println("Comparando pelo Título");
        Collections.sort(aulas);
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("\nComparando pelo Tempo");

        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });


    }
}
