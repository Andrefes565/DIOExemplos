package com.adnre.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        estados.put("MG", "Minas Gerais");
        estados.put("PE", "Pernambuco");
        estados.put("PA", "paraíba");
        estados.put("BA", "Bahia");
        estados.put("RJ", "Rio de janeiro");
        estados.put("SP", "São Paulo");
        estados.put("AL", "Alagoas");
        estados.put("SE", "Sergipe");
        //estados.put(null, "Rio grande do sul");
        System.out.println(estados.get("CE"));


        /*
        System.out.println(estados);

        estados.remove("MG");

        System.out.println(estados);

        System.out.println(estados.size());
        //estados.remove("Pernambuco");

        for(Map.Entry<String,String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + "(" +entry.getKey() + ")");
        }

        System.out.println("Há Bahia ?");
        System.out.println(estados.containsKey("BA"));

        System.out.println("Há Rio de janeiro ?");
        System.out.println(estados.containsValue("Rio de janeiro"));

        System.out.println(estados.get("Rio de janeiro"));

         */

        System.out.println(estados);
    }
}
