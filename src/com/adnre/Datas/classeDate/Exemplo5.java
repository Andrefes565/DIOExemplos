package com.adnre.Datas.classeDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo5 {
    /*
        Classe Instant ->
          - modela um ponto instantaneo de uma linha  do tempo
          - indicaçao para gravar marcaçoes temporais em eventos da sua aplicação.
     */



    public static void main(String[] args) {
        Date dataInicio = new Date(1555554334231L);
        System.out.println(dataInicio);
        //Wed Apr 17 23:25:34 BRT 2019

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);

    }



}
