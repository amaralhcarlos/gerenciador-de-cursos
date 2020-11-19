package br.com.alura;
import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...

        nomesParaIdade.keySet().forEach(key->{
            System.out.println(key);
        });

        nomesParaIdade.values().forEach(value->{
            System.out.println(value);
        });

        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();

        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}