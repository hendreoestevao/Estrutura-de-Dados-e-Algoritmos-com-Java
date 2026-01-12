package org.example.estruturadedados.pilha.labs;

import java.util.Stack;

public class Exer06 {
    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[(]}");
        imprimeResultado("A + B + C - D)");


    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + "está balanceado? " + verificarSimbolosBalanceados(expressao));
    }

    public static boolean verificarSimbolosBalanceados(String expressao) {

        boolean balanceado = true;

        Stack<Character> stack = new Stack<>();

        int index = 0;
        char simbolo, topo;

        while (index < expressao.length() && balanceado) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                stack.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {

                if (stack.empty()) {
                    balanceado = false;
                } else {
                    topo = stack.pop();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }


        return balanceado && stack.empty();

    }
}