package com.adnre.Datas.classeCalendar;

import java.util.Calendar;
import java.util.Date;

public class Exemplo1 {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data Corrente é: " + agora.getTime());

        agora.add(Calendar.DAY_OF_MONTH, 20);
        System.out.println("20 dias depois: " + agora.getTime());

        agora.add(Calendar.MONTH, -4);
        System.out.println("4 meses atrás: " + agora.getTime());

        agora.add(Calendar.YEAR, -2);
        System.out.println("2 anos atrás: " + agora.getTime());




    }
}
