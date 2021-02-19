package com.adnre.javaAvancado.paradigmaFuncional;

public class Recursividade {

    public static void main(String[] args) {
        System.out.println(fatorial(11));
    }

    public static  int fatorial(int  valor) {
        if(valor == 1)
            return valor;
        else {
            return valor * fatorial(valor - 1);
        }
    }
}
