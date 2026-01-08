package org.example.test;

import org.example.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "1234-5467", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "1234-4587", "contato3@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamannho " + vetor.tamanho());
        System.out.println(vetor);
        vetor.remover(2);
        System.out.println(vetor);
    }
}
