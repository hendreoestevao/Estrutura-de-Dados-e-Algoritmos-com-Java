package org.example.estruturadedados.pilha.labs;

import java.util.Stack;

public class Exer05 {
    public static void main(String[] args) {

        String palavra = "omissíssimo";

        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));

    }

    public static boolean testaPalindromo(String palavra) {

        Stack<Character> palindromo = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            palindromo.push(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!palindromo.isEmpty()) {
            palavraInversa += palindromo.pop();
        }

        return palavra.equalsIgnoreCase(palavraInversa);
    }
}