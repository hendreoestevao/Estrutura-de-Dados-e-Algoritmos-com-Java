package org.example.estruturadedados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    public EstruturaEstatica(){
        this(10);
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected void adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }

        this.aumentaCapacidade();
        //mover todos os elementos
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);

            this.elementos = elementosNovos;
        }
    }
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }
}
