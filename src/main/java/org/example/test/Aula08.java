package org.example.test;

import org.example.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); // 0
        vetor.adiciona("C"); // 1
        vetor.adiciona("E"); // 2
        vetor.adiciona("F"); // 3
        vetor.adiciona("G"); // 4


        System.out.println(vetor);

    }
}
