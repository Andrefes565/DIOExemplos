package com.adnre.Datas.classeDate;

import javax.xml.crypto.Data;
import java.util.Date;

public class Exemplo2 {

    //System.currenttimeMillis()

    /*Esse método estático vai nos retornar o millisegundo mais proximo da sua execução
    * com base no sistema operacional
    * */

    public static void main(String[] args) {
        Long currentimeMiiis = System.currentTimeMillis();
        System.out.println(currentimeMiiis);

        Date data = new Date(currentimeMiiis);
        System.out.println(data);


    }

}
