package org.example.labs;

import org.example.vetor.Lista;

import java.util.ArrayList;

public class Exe02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<>(5);
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F");
        lista.adiciona("G");
        lista.adiciona("E");

        System.out.println(lista.ultimoIndice("E"));

    }
}
