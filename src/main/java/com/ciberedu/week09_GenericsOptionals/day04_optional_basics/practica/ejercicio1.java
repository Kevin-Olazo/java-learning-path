package com.ciberedu.week09_GenericsOptionals.day04_optional_basics.practica;

import java.util.Optional;

public class ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1
        Optional<String> op1 = Optional.of("Hola Mundo");
        Optional<String> op2 = Optional.empty();

        System.out.println(op1);
        System.out.println(op2);

        // Ejercicio 2
        Optional<String> nombre = Optional.of("Carlos");
        Optional<String> vacio = Optional.empty();

        if (nombre.isPresent()) {
            System.out.println("Tiene valor");
        } else {
            System.out.println("Esta vacio");
        }

        if (vacio.isPresent()) {
            System.out.println("Tiene valor");
        } else {
            System.out.println("Esta vacio");
        }

        // Ejercicio 3

        Optional<Integer> optinteger = Optional.of(42);

        System.out.println(optinteger.get());

        // Ejercicio 4

        Optional<String> ciudad = Optional.empty();

        System.out.println(ciudad.orElse("Ciudad desconocida"));

        // Ejercicio 5

        Optional<String> capital = Optional.empty();
        System.out.println(capital.orElseGet(() -> "Sin capital asignada"));

        // Ejercicio 6

        Optional<String> java = Optional.of("Java");

        java.ifPresent((p) -> System.out.println("Lenguaje: " + p));

        // Ejercicio 7

        Optional<String> nombre1 = Optional.of("carlos");

        System.out.println(nombre1.map(String::toUpperCase).get());

        // Ejercicio 8

        Optional<Integer> numero = Optional.of(15);

        System.out.println(numero.filter(n -> n > 10).orElse(-1));


        // Ejercicio 9

        Optional<String> email = Optional.of("  usuario@gmail.com  ");

        String resultado = email.map(e -> e.trim()).map(e -> e.toUpperCase()).orElse("Sin email");


        System.out.println(resultado);

        // Ejercicio 10

        System.out.println(buscarUsuario(1).get());
        System.out.println(buscarUsuario(2).get());
        System.out.println(buscarUsuario(99).orElse("Usuario no encontrado"));
        System.out.println("----------------");
        buscarUsuario(1).ifPresentOrElse(u -> System.out.println(u), () -> System.out.println("Usuario no encontrado"));

    }

    public static Optional<String> buscarUsuario(int id){

        if (id == 1){
            return Optional.of("Ana");
        } else if(id == 2){
            return Optional.of("Luis");
        }

        return Optional.empty();


    }
}
