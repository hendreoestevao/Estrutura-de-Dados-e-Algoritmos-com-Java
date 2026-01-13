package org.example.fila.labs;

import org.example.fila.FilaComPrioridade;
import org.example.fila.dominio.Pessoa;

public class Exer03 {

    public static final int VERDE = 2;
    public static final int VERMELHO = 0;
    public static final int AMARELO = 1;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", AMARELO));
        fila.enfileira(new Pessoa("3", VERMELHO));
        fila.enfileira(new Pessoa("4", VERDE));
        fila.enfileira(new Pessoa("5", VERDE));
        fila.enfileira(new Pessoa("6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PsNovosPacientes novosPacientes = new PsNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(novosPacientes);

        t1.start();
        t2.start();


    }
}
