package com.adnre.Datas.classeCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        System.out.println("dd/MM/yyyy");
        System.out.println("Digite a data do vencimento da sua fatura");
        String dataVenc = scan.next();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataVenc);

        Calendar dataLimite = Calendar.getInstance();
        dataLimite.setTime(data);
        dataLimite.add(Calendar.DATE,10);

        if(dataLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            dataLimite.add(Calendar.DAY_OF_MONTH,2);
        else if (dataLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            dataLimite.add(Calendar.DAY_OF_MONTH,1);

        System.out.println("Voce pode pagar sem taxa de juros até esta data: "+ formato.format(dataLimite.getTime()));


    }
}
