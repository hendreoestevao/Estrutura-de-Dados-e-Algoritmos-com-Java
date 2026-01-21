package org.example.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adicionar(T elemento) {
        No<T> celula = new No<>(elemento);
        if(this.tamanho == 0) {
            this.inicio = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;

        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpa(){

        for(No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {

        if(this.tamanho == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();

        No<T> atual = this.inicio;
        builder.append(atual.getElemento()).append(",");
        while(atual.getProximo() != null){
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }


        return builder.toString();
    }
}
