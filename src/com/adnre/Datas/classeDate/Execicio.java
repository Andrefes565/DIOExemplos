package com.adnre.Datas.classeDate;

import java.util.Calendar;
import java.util.Date;

public class Execicio {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(1995, Calendar.AUGUST, 13);
        Date dataNasc = new Date(c.getTimeInMillis());

        Calendar d = Calendar.getInstance();
        d.set(2010, Calendar.MAY, 15);
        Date dataComparada = new Date(d.getTimeInMillis());



        if(dataNasc.before(dataComparada))
            System.out.println("tá Velhinho hein fio!");


    }

}
