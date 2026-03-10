package com.ciberedu.week09_GenericsOptionals.day04_optional_basics.practica2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("Ana", "555-1234"));
        agenda.agregarContacto(new Contacto("Luis", "555-5678"));
        agenda.agregarContacto(new Contacto("Maria", "555-9999"));

        // 👉 EJERCICIO C:
        // Usa buscarPorNombre() para buscar "Luis"
        // Si existe, imprime: "Contacto encontrado: Luis - 555-5678"
        // Si no existe, imprime: "Contacto no encontrado"
        agenda.buscarPorNombre("Luis").ifPresentOrElse(c -> System.out.println("Contacto encontrado: " + c.getNombre() + " - " + c.getTelefono()), () -> System.out.println("Contacto no encontrado"));

        // 👉 EJERCICIO D:
        // Usa buscarTelefonoPorNombre() para buscar el teléfono de "Pedro"
        // (Pedro no existe en la agenda)
        // Si existe, imprímelo. Si no, imprime: "Sin teléfono registrado"
        agenda.buscarTelefonoPorNombre("Pedro").ifPresentOrElse(t -> System.out.println(t), () -> System.out.println("Sin telefono registrado"));
    }
}
