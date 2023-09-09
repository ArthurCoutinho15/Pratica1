package br.newtonpaiva;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> noivo = new LinkedList<>();
        LinkedList<String> noiva = new LinkedList<>();

        try (Scanner scanner = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\pratica3-2\\src\\br\\newtonpaiva\\Noivo.txt"))) {
            while (scanner.hasNextLine()) {
                noivo.add(scanner.nextLine());
            }
        }
        try (Scanner scanner = new Scanner(new File("C:\\Users\\12116681\\IdeaProjects\\pratica3-2\\src\\br\\newtonpaiva\\Noiva.txt"))) {
            while (scanner.hasNextLine()) {
                noivo.add(scanner.nextLine());
            }
        }

        LinkedList<String> convidados = new LinkedList<>(noivo);
        convidados.addAll(noiva);

         Collections.sort(convidados);

        for (String o: convidados) {
            System.out.println(o);
        }


    }
}
