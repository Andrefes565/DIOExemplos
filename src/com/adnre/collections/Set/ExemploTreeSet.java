package com.adnre.collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<String> cidade = new TreeSet<>();
        //"Porto Alegre", "Florianópolis", "Curitiba", "São Paulo", "Rio de Janeiro"
        cidade.add("porto alegre");
        cidade.add("Florianopolis");
        cidade.add("curitiba");
        cidade.add("São Paulo");
        cidade.add("Rio");
        System.out.println(cidade);

    }
}
