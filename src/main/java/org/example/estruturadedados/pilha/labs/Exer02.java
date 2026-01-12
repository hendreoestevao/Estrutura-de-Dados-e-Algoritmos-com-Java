package org.example.estruturadedados.pilha.labs;

import org.example.estruturadedados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();

            if (num == 0) {
                Integer desempilhado = par.desempilhar();

                if (desempilhado == null) {
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);

                }

                // pilha impar

                desempilhado = impar.desempilhar();

                if (desempilhado == null) {
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + desempilhado);

                }

            } else if (num % 2 == 0) {
                par.empilhar(num);
                System.out.println("Número par, empilhado na pilha par: " + num);
            } else {
                impar.empilhar(num);
                System.out.println("Numero impar, empilhado na pilha impar: " + num);
            }
        }

        System.out.println("Desempilhando todos os números da pilha par ");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilhar());
        }

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha impar: " + impar.desempilhar());
        }
    }
}