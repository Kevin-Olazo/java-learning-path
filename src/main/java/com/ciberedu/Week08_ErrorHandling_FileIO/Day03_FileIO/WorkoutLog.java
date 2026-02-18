package com.ciberedu.Week08_ErrorHandling_FileIO.Day03_FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkoutLog {
    private static final String FILE_NAME = "workout_data.csv";
    // TODO: Define el Path aquí usando FILE_NAME
    Path myPath = Path.of(FILE_NAME);


    public void addExercise(Exercise ex) {
        // TODO: Implementar
        // Opción A: Guardar en una lista en memoria y luego guardar todo.
        // Opción B: Escribir directamente al archivo usando APPEND (más eficiente para logs).
        try {
            Files.writeString(myPath, ex.toCSV() + "\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE) ;
        } catch (IOException e) {
            System.out.println("No puedo leer el archivo");
        }
        // Recuerda manejar IOException con try-catch.
    }

    public List<Exercise> loadHistory() {
        List<Exercise> exercises = new ArrayList<>();
        try {
            List<String> exercisesData = Files.readAllLines(myPath);

            if (!exercisesData.isEmpty()){
                for(String ex : exercisesData){
                    List<String> data = List.of(ex.split(","));
                    Exercise newExercise = new Exercise();
                    try {
                        String date = data.get(0);
                        String name = data.get(1);
                        int sets = Integer.parseInt(data.get(2));
                        int reps = Integer.parseInt(data.get(3));
                        double weight = Double.parseDouble(data.get(4));

                        newExercise.setDate(date);
                        newExercise.setName(name);
                        newExercise.setSets(sets);
                        newExercise.setReps(reps);
                        newExercise.setWeight(weight);
                        exercises.add(newExercise);
                    } catch (NumberFormatException e) {
                        System.out.println("Sets o reps deben ser dígitos numéricos");
                    }

                }

            } else{
                System.out.println("Lista esta vacía");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error, la lista no existe.");
        }
        return exercises;
    }

}