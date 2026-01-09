package org.example.labs;

import org.example.vetor.Lista;

public class Exe01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");


        System.out.println(lista.contem("A"));

    }
}
