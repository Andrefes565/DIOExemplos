package com.adnre.javaAvancado.paradigmaFuncional;

import java.util.HashMap;
import java.util.Map;

public class FatorialComMemorization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 " + (F-I));
    }

    public static  Integer fatorialComMemorization(Integer valor) {
        if(valor == 1)
            return valor;
        else {
            if(MAPA_FATORIAL.containsKey(valor))
                return MAPA_FATORIAL.get(valor);
            else {
                Integer resultado = valor * fatorialComMemorization(valor - 1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }

}



