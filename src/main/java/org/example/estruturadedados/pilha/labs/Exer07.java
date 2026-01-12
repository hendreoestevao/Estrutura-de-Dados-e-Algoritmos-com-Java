package org.example.estruturadedados.pilha.labs;


import java.util.Stack;

public class Exer07 {

    public static void main(String[] args) {
        imprimeResultado(2);

        imprimeResultado(4);

        imprimeResultado(10);

        imprimeResultado(25);

        imprimeResultado(10035);

        imprimeResultadoQualquerBase(25, 16);

        imprimeResultadoQualquerBase(10035, 8);

        imprimeResultadoQualquerBase(10035, 16);



    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) {
        System.out.println(numero + " na base é: " + decimalBinarioQualquerBase(numero, base));
    }

    public static String decimalBinario(int num) {
        Stack<Integer> pilha = new Stack<>();
        String binario = "";
        int resto;

        while (num > 0) {
            resto = num % 2;
            pilha.push(resto);
            num = num / 2;
        }

        while (!pilha.isEmpty()) {
            binario += pilha.pop();
        }

        return binario;
    }


    public static String decimalBinarioQualquerBase(int num, int base) {

        if (base > 16) {
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numeroBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (num > 0) {
            resto = num % base;
            pilha.push(resto);
            num = num / base;
        }

        while (!pilha.isEmpty()) {
            numeroBase += bases.charAt(pilha.pop());
        }

        return numeroBase;
    }
}