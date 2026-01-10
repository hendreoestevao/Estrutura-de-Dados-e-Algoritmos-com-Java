package org.example.vetor;

import org.example.estruturadedados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {


    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Lista2() {
        super();
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    protected void adiciona(int posicao, T elemento) {
        super.adiciona(posicao, elemento);
    }

}