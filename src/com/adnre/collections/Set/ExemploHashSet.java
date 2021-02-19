package com.adnre.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(4.5);
        notasAlunos.add(5.4);
        notasAlunos.add(4.8);
        notasAlunos.add(8.5);
        notasAlunos.add(9.5);
        notasAlunos.add(2.9);
        notasAlunos.add(9.9);

        notasAlunos.add(null);
        System.out.println(notasAlunos);
        //tem os metodos comuns de list
        // remove(),    Iterator, clear...
    }
}
