package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

public final class ImmutablePerson { // Final class prevents subclassing
    private final String name;  // Final field: Set one, immutable
    private final int id;       // Read-only property

    public ImmutablePerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter only no setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
