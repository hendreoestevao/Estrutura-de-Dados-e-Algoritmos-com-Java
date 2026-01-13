package org.example.fila.test;

import org.example.fila.FilaComPrioridade;
import org.example.fila.dominio.Paciente;

import java.util.LinkedList;
import java.util.Queue;

public class Aula24 {

    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("C", 1));
        fila.enfileira(new Paciente("B", 3));
        System.out.println(fila);

        System.out.println(fila.desenfileira());
    }
}
