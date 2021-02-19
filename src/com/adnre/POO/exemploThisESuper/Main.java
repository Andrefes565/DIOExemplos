package com.adnre.POO.exemploThisESuper;

import com.adnre.POO.exemploThisESuper.Moto;
import com.adnre.POO.exemploThisESuper.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro("fiat", "Sieana", 1000.0, 4);
        Veiculo moto = new Moto("Honda", "CB300", 500.0, 300);

        System.out.println(carro.toString());
        System.out.println(moto.toString());


    }
}

