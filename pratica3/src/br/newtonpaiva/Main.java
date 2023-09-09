package br.newtonpaiva;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listaPrioridade = new LinkedList<Integer>();
        LinkedList<Integer> listaPadrao = new LinkedList<Integer>();

        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                listaPadrao.add(i);
            } else {
                listaPrioridade.add(i);
            }
        }
        System.out.println("Fila Prioritária: ");
        for (int o : listaPrioridade) {
            System.out.println(o);
        }
        System.out.println("Fila Normal");
        for (int o : listaPadrao) {
            System.out.println(o);
        }


    }
}
