package org.example.estruturadedados.pilha.teste;

import org.example.estruturadedados.pilha.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());

        pilha.empilhar(1);

        System.out.println(pilha.estaVazia());
    }
}
