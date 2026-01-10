package org.example.estruturadedados.pilha.teste;

import org.example.estruturadedados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elemento " + pilha.desempilhar());
        System.out.println(pilha);
    }
}
