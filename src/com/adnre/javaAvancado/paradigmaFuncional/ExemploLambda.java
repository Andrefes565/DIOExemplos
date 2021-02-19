package com.adnre.javaAvancado.paradigmaFuncional;

public class ExemploLambda {
    /*
        Estrutura de uma função lambda

        interfaceFuncional nomeVariavel = paramentro -> logica
     */

    public static void main(String[] args) {
        Funcao prefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(prefixoSenhorNaString.gerar("joão"));

        Funcao a = valor -> "2";
    }
}

@FunctionalInterface
interface Funcao {
    String gerar(String valor);
}
