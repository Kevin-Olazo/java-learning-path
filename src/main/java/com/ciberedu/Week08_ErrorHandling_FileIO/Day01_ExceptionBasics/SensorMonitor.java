package com.ciberedu.Week08_ErrorHandling_FileIO.Day01_ExceptionBasics;

public class SensorMonitor {

    public void startMonitoring() {
        TemperatureSensor sensor = new TemperatureSensor();
        // TODO: Envuelve esto en un bloque try-catch-finally
        // 1. Intenta leer la temperatura
        sensor.setOnline(false);
        try {
            System.out.println("Escaneando temperatura... ");
            System.out.println(sensor.getTemperature() + " grados.");
        } catch (IllegalStateException e) {// 2. Atrapa las excepciones específicas (imprime el error)
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        } finally {
            // 3. Asegúrate de que sensor.close() se llame SIEMPRE en el finally
            sensor.close();
        }
    }

    public static void main(String[] args) {
        new SensorMonitor().startMonitoring();
    }
}
