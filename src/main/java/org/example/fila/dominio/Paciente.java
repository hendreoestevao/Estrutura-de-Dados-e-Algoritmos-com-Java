package org.example.fila.dominio;

//public class Paciente implements Comparable<Paciente>{


public class Paciente {

    private String nome;
    private int proridade;


    public Paciente(String nome, int proridade) {
        this.nome = nome;
        this.proridade = proridade;
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProridade() {
        return proridade;
    }

    public void setProridade(int proridade) {
        this.proridade = proridade;
    }

//    @Override
//    public int compareTo(Paciente o) {
//
//        if (this.proridade > o.getProridade()) {
//            return 1;
//        } else if (this.proridade < o.getProridade()) {
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", proridade=" + proridade +
                '}';
    }
}
