package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numerosList = new ArrayList<>();
        Collection<Integer> numerosSet = new HashSet<>();

        action(numerosList);
        System.out.println("------------------------------------------------------------");
        action(numerosSet);

    }

    public static void action(Collection<Integer> collection){

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            collection.add(i);
        }

        for (Integer item : collection) {
            collection.contains(item);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}