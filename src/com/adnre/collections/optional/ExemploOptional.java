package com.adnre.collections.optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalNull = Optional.ofNullable("carla");
        /*
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        if(optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));

         */

        System.out.println(optionalNull.get());

    }
}
