package com.ciberedu.Week08_ErrorHandling_FileIO.Day03_FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;

public class WorkoutLog {
    private static final String FILE_NAME = "workout_data.csv";
    // TODO: Define el Path aquí usando FILE_NAME
    Path myPath = Path.of(FILE_NAME);


    public void addExercise(Exercise ex) {
        // TODO: Implementar
        // Opción A: Guardar en una lista en memoria y luego guardar todo.
        // Opción B: Escribir directamente al archivo usando APPEND (más eficiente para logs).
        try {
            Files.writeString(myPath, ex.toCSV() + "\n", StandardOpenOption.APPEND,CREATE) ;
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
                    Exercise newExer = new Exercise();
                    newExer.setDate(data.get(0));
                    newExer.setName(data.get(1));
                    newExer.setSets(Integer.parseInt(data.get(2)));
                    newExer.setReps(Integer.parseInt(data.get(3)));
                    newExer.setWeight(Double.parseDouble(data.get(4)));
                    exercises.add(newExer);
                }

            } else{
                System.out.println("Lista esta vacía");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return exercises;
    }

}