package org.example.fila.test;

import org.example.fila.Fila;

public class Aula22 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("fila esta vazia? " + fila.estaVazia());
        System.out.println("tamanho da fila " + fila.tamanho());
        System.out.println(fila);
        System.out.println("primeiro da fila " + fila.espiar());
        System.out.println("item desenfileirado " + fila.desenfileira());
        System.out.println(fila);
        System.out.println("item desenfileirado " + fila.desenfileira());
        System.out.println(fila);
    }
}
