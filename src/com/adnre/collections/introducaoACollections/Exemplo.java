package com.adnre.collections.introducaoACollections;

import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Andre");
        nomes.add("Ana");
        nomes.add("Isabelle");
        nomes.add("Vanessa");
        nomes.add("Lucas");
        nomes.add("Felipe");
        nomes.add("Melle");
        nomes.add("Marcio");


        nomes.set(0, "Adriana");

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove("Ana");
        nomes.remove(2);
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println("tamnaho: " + tamanho);

        int posicaoAdriana = nomes.indexOf("Adriana");
        System.out.println("A posição da Adriana é:" +posicaoAdriana );

        System.out.println("------ Utilizando o for ------");
        for(String nomeDoItem: nomes) {
            System.out.println(nomeDoItem);
        }

        System.out.println("------ Utilizando Iterator ------");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
