package com.adnre.collections.queu;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("André");
        filaBanco.add("Felipe");
        filaBanco.add("Anderson");
        filaBanco.add("maria");
        filaBanco.add("João");


        System.out.println(filaBanco);

        //pool() -> retorna o primeiro elemento e o exclui
        String clienteAserAtendido = filaBanco.poll();
        System.out.println(filaBanco);

        //peek()-> retorna o primeiro elemeno
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
    }
}
