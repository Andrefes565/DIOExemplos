package com.adnre.Datas.datasNoJava8;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTime1 {
    /*
        LocalTime é uma classe  imutável que apresenta um padrao de hora:minuto:segundo
        LocalTime pode ser apresentado até no nivel de nano-segundos. Exemplo 12:22:10:122316537
     */
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime duasHorasDepois = agora.plusHours(2);
        System.out.println(duasHorasDepois);

    }
}
