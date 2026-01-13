package org.example.fila.labs;

import org.example.fila.FilaComPrioridade;
import org.example.fila.dominio.Pessoa;

public class PSAtendimento implements Runnable {

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Atendimento concluido.");

    }
}
