package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name; // Private field for encapsulation
    private final String dni;
    private LocalDate birthDate;

    public Person(String name, String dni, LocalDate birthDate){
        setName(name);
        this.birthDate = birthDate;
        this.dni = dni;
    }

    // Getter: Returns the value
    public String getName() {
        return name;
    }

    // Computed Getter: Calculates age dynamically
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Setter: Updated with validation

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
}
