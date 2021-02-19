package com.adnre.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioStreams {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        Estudante e1 = new Estudante("André", 25);
        Estudante e2 = new Estudante("Felipe", 19);
        Estudante e3 = new Estudante("Maria", 17);
        Estudante e4 = new Estudante("João", 22);
        Estudante e5 = new Estudante("Pedro", 20);

        estudantes.add(e1);
        estudantes.add(e2);
        estudantes.add(e3);
        estudantes.add(e4);
        estudantes.add(e5);

        System.out.println("Estudantes na coleção: " + estudantes.stream().count());

        System.out.println("Estudantes maiores de idade:");
        List<Estudante> novosEstudantes = estudantes.stream().filter( (e) -> e.getIdade() >= 18).collect(Collectors.toList());
        for(Estudante e: novosEstudantes) {
            System.out.println(e.getNome());
        }

        System.out.println("Estudantes com a letra 'a':");
        List <Estudante> letraAEstudantes = estudantes.stream().filter( (e) -> e.getNome().toLowerCase().contains("a")).collect(Collectors.toList());
        for(Estudante a: letraAEstudantes) {
            System.out.println(a.getNome());
        }

        System.out.println("Há algum estudante com a letra 'u' no nome?");
        System.out.println(estudantes.stream().anyMatch((e) -> e.getNome().toLowerCase().contains("u")));


        Estudante ev = estudantes.stream().max(Comparator.comparing(Estudante::getIdade)).get();
        System.out.println("Estudante mais velho é: " + ev.getNome());

        Estudante ej = estudantes.stream().min(Comparator.comparing(Estudante::getIdade)).get();
        System.out.println("Estudante mais jovem é: " + ej.getNome());
    }
}



class Estudante {

    private String nome;
    private Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


}
