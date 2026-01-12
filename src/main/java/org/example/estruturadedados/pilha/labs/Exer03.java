package org.example.estruturadedados.pilha.labs;

import org.example.estruturadedados.pilha.Pilha;
import org.example.estruturadedados.pilha.dominio.Livro;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha(20);

        Livro livro1 = new Livro();
        livro1.setIsbn("978-85-12345-01-1");
        livro1.setAutor("Machado de Assis");
        livro1.setAnoLancamento(1899);
        livro1.setNome("Dom Casmurro");

        Livro livro2 = new Livro();
        livro2.setIsbn("978-85-12345-02-2");
        livro2.setAutor("George Orwell");
        livro2.setAnoLancamento(1949);
        livro2.setNome("1984");

        Livro livro3 = new Livro();
        livro3.setIsbn("978-85-12345-03-3");
        livro3.setAutor("J.K. Rowling");
        livro3.setAnoLancamento(1997);
        livro3.setNome("Harry Potter e a Pedra Filosofal");

        Livro livro4 = new Livro();
        livro4.setIsbn("978-85-12345-04-4");
        livro4.setAutor("J.R.R. Tolkien");
        livro4.setAnoLancamento(1954);
        livro4.setNome("O Senhor dos Anéis");



        Livro livro5 = new Livro();
        livro5.setIsbn("978-85-12345-05-5");
        livro5.setAutor("Dan Brown");
        livro5.setAnoLancamento(2003);
        livro5.setNome("O Código Da Vinci");

        Livro livro6 = new Livro();
        livro6.setIsbn("978-85-12345-06-6");
        livro6.setAutor("Antoine de Saint-Exupéry");
        livro6.setAnoLancamento(1943);
        livro6.setNome("O Pequeno Príncipe");

        System.out.println("Pilha de livros criada, pilha está vazia " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha");

        pilha.empilhar(livro1);
        pilha.empilhar(livro2);
        pilha.empilhar(livro3);
        pilha.empilhar(livro4);
        pilha.empilhar(livro5);
        pilha.empilhar(livro6);

        System.out.println(pilha.tamanho() + " Livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Desempilhando livros na pilha ");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livros " + pilha.desempilhar());
        }

        System.out.println("Todos os livros foram desempilhadosm pilha vazia " + pilha.estaVazia());
    }
}