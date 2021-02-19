package com.adnre.SOLID.L.problem;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setLargura(5.0);
        retangulo.setAltura(10.0);

        System.out.println("Area:" + retangulo.getArea());
    }

}
