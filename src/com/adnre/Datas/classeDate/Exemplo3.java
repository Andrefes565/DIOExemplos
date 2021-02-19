package com.adnre.Datas.classeDate;

import java.util.Date;

public class Exemplo3 {

    /*
    * EXEMPLO DE UTILIZAÇÃO DOS METODOS AFTER() E BEFORE()
    * */

    public static void main(String[] args) {
        Date dataPassado = new Date(1555554334231L);
        //Wed Apr 17 23:25:34 BRT 2019
        Date dataFuturo = new Date(1755554334231L);
        // Mon Aug 18 18:58:54 BRT 2025

        //compara se a dataPassado é posterior a dataFuturo
        boolean isAfter = dataPassado.after(dataFuturo);
        System.out.println(isAfter);

        //compara se a dataPassado é posterior a dataFuturo
        boolean isBefore = dataPassado.before(dataFuturo);
        System.out.println(isBefore);
    }
}
