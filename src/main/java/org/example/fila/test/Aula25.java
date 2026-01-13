package org.example.fila.test;

import org.example.fila.dominio.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
//        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
//
//        filaComPrioridade.add(2);
//        filaComPrioridade.add(1);
//        filaComPrioridade.add(3);
//
//        System.out.println(filaComPrioridade);

        Queue<Paciente> pacientes = new PriorityQueue<>(new Comparator<Paciente>() {

            @Override
            public int compare(Paciente o1, Paciente o2) {
//                    if (o1.getProridade() > o2.getProridade()) {
//                        return 1;
//                    } else if (o1.getProridade() < o2.getProridade()) {
//                        return -1;
//                    }
//                    return 0;

                return Integer.valueOf(o1.getProridade()).compareTo(o2.getProridade());
            }
        });
        pacientes.add(new Paciente("A", 2));
        pacientes.add(new Paciente("B", 1));

        System.out.println(pacientes);
    }
}
