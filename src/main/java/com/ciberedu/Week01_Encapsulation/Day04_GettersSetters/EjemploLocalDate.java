package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDate {
    public static void main(String[] args) {
        // LocalDate usa el formato yyyy-MM-dd

        // Obtenemos la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        // Sumar días a la fecha actual
        LocalDate fechaSumaDias = fechaActual.plusDays(5);
        System.out.println("Fecha después de sumar 5 dias: " + fechaSumaDias);

        // Restar meses a la fecha actual
        LocalDate fechaRestaMeses = fechaActual.minusMonths(3);
        System.out.println("Fecha después de restar 3 meses: " + fechaRestaMeses);

        // Sumar años a la fecha actual
        LocalDate fechaSumaAnios = fechaActual.plusYears(10);
        System.out.println("Fecha después de sumar 10 años: " + fechaSumaAnios);

        // Formatear la fecha como una cadena (String)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);

        // Imprimit la fecha formateada
        System.out.println("Fecha actual: " + fechaFormateada);



    }
}


