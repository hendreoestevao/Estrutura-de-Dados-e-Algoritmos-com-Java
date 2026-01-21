package org.example.lista.test;

import org.example.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        removeInicio();

    }


    public static void removeInicio() {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println(lista);
        lista.removeInicio();

        System.out.println(lista);

        lista.removeInicio();
        System.out.println(lista);

    }

    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);

        System.out.println(lista);
    }


    public static void testesIniciais() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(1);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adicionar(2);
        System.out.println(lista);

        lista.adicionar(3);
        System.out.println(lista);

        //busca por elemento
        System.out.println("*****Busca por elemento");
        System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        //busca por posição
        System.out.println("*****Busca por posição");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(-1));
        System.out.println(lista.buscaPorPosicao(4));
    }
}
