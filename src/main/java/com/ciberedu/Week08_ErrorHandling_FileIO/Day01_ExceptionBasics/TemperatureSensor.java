package com.ciberedu.Week08_ErrorHandling_FileIO.Day01_ExceptionBasics;

public class TemperatureSensor {
    private boolean isOnline = true;

    public int getTemperature() {

        int temp = 0;


        // 1. Si no está online -> Lanza excepción
        if (!isOnline) {
            throw new IllegalStateException("Sensor Offline");
        }

        // 2. Genera un número aleatorio (o usa valores fijos para probar)
        temp = (int) (Math.random() * 301) - 100;

        // 3. Si el valor es < -50 o > 150 -> Lanza IllegalArgumentException
        if (temp < -50 || temp > 150) {
            throw new IllegalArgumentException("Temp cannot be lower that -50 or higher than 150");
        }

        return temp;
    }

    public void close() {
        System.out.println("Cerrando Conexion");
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
