package org.example.estruturadedados.pilha.teste;

import org.example.estruturadedados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();


        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
