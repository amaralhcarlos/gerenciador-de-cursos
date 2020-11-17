package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Maurício Aniche");
        alunos.add("Alberto Souza"); //Não funciona pois já temos um elemento similar já dentro do nosso set

        System.out.println(alunos.size());

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        boolean isPauloRegistered = alunos.contains("Paulo Silveira");
        System.out.println(isPauloRegistered);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
