package org.example.estruturadedados.pilha.teste;

import org.example.estruturadedados.pilha.Pilha;

public class Aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());

        pilha.empilhar(1);
        pilha.empilhar(2);

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
