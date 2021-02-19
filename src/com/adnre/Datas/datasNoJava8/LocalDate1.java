package com.adnre.Datas.datasNoJava8;

import java.time.LocalDate;

public class LocalDate1 {
    /*
        LocalDate é uma classe imutavel para apresentar uma data
        seu formato padrão é dd-MM-yyyy
     */

    public static void main(String[] args) {
        java.time.LocalDate hoje = java.time.LocalDate.now();
        System.out.println("---Hoje---");
        System.out.println(hoje);

        java.time.LocalDate ontem = hoje.minusDays(1);
        System.out.println("---Ontem---");
        System.out.println(ontem);

        java.time.LocalDate amanha = hoje.plusDays(1);
        System.out.println("---Amanhã---");
        System.out.println(amanha);
    }
}
