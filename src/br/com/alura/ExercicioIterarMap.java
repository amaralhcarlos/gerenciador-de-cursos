package br.com.alura;

import java.util.HashMap;
        import java.util.Map;

public class ExercicioIterarMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        //...

        pessoas.keySet().forEach(key->{
            System.out.println("Olá, " + pessoas.get(key)+"!");
        });
    }
}