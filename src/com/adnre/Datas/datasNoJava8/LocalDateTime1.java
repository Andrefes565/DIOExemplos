package com.adnre.Datas.datasNoJava8;

import java.time.LocalDateTime;

public class LocalDateTime1 {
    /*
        LocalDateTime apresenta uma junção entre data e hora
     */
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime futuro = agora.plusDays(1).plusHours(3).plusMinutes(40);

        System.out.println(futuro);
    }
}
