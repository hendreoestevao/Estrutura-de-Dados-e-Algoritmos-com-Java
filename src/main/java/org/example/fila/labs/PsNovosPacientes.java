package org.example.fila.labs;

import org.example.fila.FilaComPrioridade;
import org.example.fila.dominio.Pessoa;

import java.util.Random;

public class PsNovosPacientes implements Runnable {
    private final FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private final Random prioridade = new Random();

    public PsNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfilheirada.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
