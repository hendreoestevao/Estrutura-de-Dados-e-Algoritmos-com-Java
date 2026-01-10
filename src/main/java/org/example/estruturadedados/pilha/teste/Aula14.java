package org.example.estruturadedados.pilha.teste;

import org.example.estruturadedados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

       for (int i = 1; i <= 11; i++) {
           pilha.empilhar(i);
       }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
