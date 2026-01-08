package org.example.test;

import org.example.vetor.Lista;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

         arrayList.add("A");
         arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento nao existe no array");
        }

        int pos = arrayList.indexOf("B");
        System.out.println(pos);
        if (pos > -1) {
            System.out.println("Elmento existe no array " + pos);
        } else {
            System.out.println("Elmento nao existe no array " + pos);
        }

        System.out.println(arrayList.get(1));

        arrayList.remove(1);
        arrayList.size();
    }
}
