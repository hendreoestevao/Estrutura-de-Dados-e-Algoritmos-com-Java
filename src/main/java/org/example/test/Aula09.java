package org.example.test;

import org.example.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); // 0
        vetor.adiciona("C"); // 1
        vetor.adiciona("E"); // 2
        vetor.adiciona("F"); // 3
        vetor.adiciona("G"); // 4


        System.out.println(vetor);
        vetor.remover(1);
        System.out.println(vetor);
        System.out.println("Remover o elemento A");

        int pos = vetor.busca("A");
       if(pos > -1) {
           vetor.remover(pos);
       } else {
           System.out.println("Elemento não existe no vetor");
       }
        System.out.println(vetor);

    }
}
