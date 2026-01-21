package org.example.lista.test;

import org.example.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(1);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adicionar(2);
        System.out.println(lista);

        lista.adicionar(3);
        System.out.println(lista);
        lista.limpa();
        System.out.println(lista);
    }
}
