package com.adnre.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        Map<String, Integer> campeoesMudialFifa = new HashMap<>();

        //adiciona os campeoes  mundias fifa no mapa

        campeoesMudialFifa.put("Brasil", 5);
        campeoesMudialFifa.put("Alemanha", 4);
        campeoesMudialFifa.put("Itália", 4);
        campeoesMudialFifa.put("Uruguai", 2);
        campeoesMudialFifa.put("Argentina", 2);
        campeoesMudialFifa.put("Franca", 2);
        campeoesMudialFifa.put("inglaterra", 1);
        campeoesMudialFifa.put("Espanha", 1);

        System.out.println(campeoesMudialFifa);

        //atualiza valor para chave brasil
        campeoesMudialFifa.put("Brasil", 6);
        System.out.println(campeoesMudialFifa);

        //retorna se existe ou nao o campeao frança
        System.out.println(campeoesMudialFifa.containsKey("França"));

        //retorna se existe uma seleção hexa campeã ou não
        System.out.println(campeoesMudialFifa.containsValue(6));

        //Navega nos registros do mapa
        for(Map.Entry<String,Integer> entry : campeoesMudialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for(String key : campeoesMudialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMudialFifa.get(key));
        }



    }
}
