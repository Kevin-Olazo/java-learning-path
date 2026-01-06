package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {
        // LocalDate usa el formato yyyy-MM-dd

        // Para asignar una fecha usamos LocalDate.of(año-mes-dia);
        LocalDate fechaEspecifica = LocalDate.of(2007, 12, 22);

        // Obtenemos la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        // Formatear la fecha como una cadena (String)
        // Primero formamos el formato en el que queremos obtener la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd | MMMM | yyyy") ;
        // Luego lo retornamos como cadena.
        String fechaFormat = fechaActual.format(formatter);

        System.out.println(fechaFormat);

        // Cadena para traducir
        String diaSemana =
                switch (fechaActual.getDayOfWeek()) {
                    case MONDAY -> "Lunes";
                    case TUESDAY -> "Martes";
                    case WEDNESDAY -> "Miércoles";
                    case THURSDAY -> "Jueves";
                    case FRIDAY -> "Viernes";
                    case SATURDAY -> "Sábado";
                    case SUNDAY -> "Domingo";
                };

        // metodos para obtener partes de la fecha
        int today = fechaActual.getDayOfMonth();
        int month = fechaActual.getMonthValue();
        int year = fechaActual.getYear();

        String mes = fechaActual.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(mes.toUpperCase());

        System.out.println("Hoy es: " + today);
        System.out.println("El mes es: " + month);
        System.out.println("El año: " + year);

        // Sumar días a la fecha actual
        LocalDate fechaSumaDias = fechaActual.plusDays(5);
        System.out.println("Fecha después de sumar 5 dias: " + fechaSumaDias);

        // Restar meses a la fecha actual
        LocalDate fechaRestaMeses = fechaActual.minusMonths(3);
        System.out.println("Fecha después de restar 3 meses: " + fechaRestaMeses);

        // Sumar años a la fecha actual
        LocalDate fechaSumaAnios = fechaActual.plusYears(10);
        System.out.println("Fecha después de sumar 10 años: " + fechaSumaAnios);


        // Comparamos fechas (isAfter, isBefore)
        LocalDate fecha1 = LocalDate.of(2025, 10, 10);
        LocalDate fecha2 = LocalDate.now();

        boolean despues = fecha1.isAfter(fecha2);
        boolean antes = fecha1.isBefore(fecha2);

        System.out.println(despues);
        System.out.println(antes);

        // Periodo entre fechas
        Period period = Period.between(fecha1, fechaActual);
        System.out.println("Años: " + period.getYears());
        System.out.println("Meses: " + period.getMonths());
        System.out.println("Dias: " + period.getDays());

        

    }
}


