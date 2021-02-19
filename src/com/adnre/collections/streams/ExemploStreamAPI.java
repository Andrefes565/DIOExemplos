package com.adnre.collections.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
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

        //retorna a contagem de nomes
        System.out.println("Contagem: " + nomes.stream().count());

        //retorna o elemento com o maior numero de letras
        System.out.println("Maior numero de letras:" + nomes.stream().max(Comparator.comparing(String::length)));

        //retorna o elemento com o menor numero de letras
        System.out.println("Maior numero de letras:" + nomes.stream().min(Comparator.comparing(String::length)));

        //Retorna os elementos que têm a letra a no nome
        System.out.println("letra 'a' no nome: " + nomes.stream()
                .filter((nome) -> nome.toLowerCase().contains("a")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados e quantidade de letras de cada nome
        System.out.println("quantidade de letras: " + nomes.stream().map( nome ->
                nome.concat("-").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));

        //Retorna os 3 primeiros elementos da coleção
        System.out.println("3 primeiros nomes:" + nomes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento sem retornar outra coleção
        System.out.println("Retorna os elementos novamente");
        nomes.stream().forEach(System.out::println);

        //Retorna true se todos os elemenetos possuirem a letra 'a' no nome
        System.out.println("todos os elementos com a letra 'a' no nome ?" + nomes.stream()
                .allMatch((elemento) -> elemento.toLowerCase().contains("a")));

        //Retorna true se algum elemeneto possui a letra 'a' no nome
        System.out.println("tem algum elemento com a letra 'a' no nome ?" + nomes.stream()
                .anyMatch((elemento) -> elemento.toLowerCase().contains("a")));

        //Retorna true se nenhum elemeneto possui a letra 'a' no nome
        System.out.println("Nenhum elemento com a letra 'a' no nome ?" + nomes.stream()
                .noneMatch((elemento) -> elemento.toLowerCase().contains("a")));
    }
}
