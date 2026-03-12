package com.ciberedu.week09_GenericsOptionals.day04_optional_basics.practica2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private List<Contacto> contactos = new ArrayList<>();

    public void agregarContacto(Contacto c) {
        contactos.add(c);
    }

    // 👉 EJERCICIO A:
    // Implementa este método: busca un contacto por nombre.
    // Si lo encuentra, retorna Optional con el contacto.
    // Si no existe, retorna Optional vacío.
    public Optional<Contacto> buscarPorNombre(String nombre) {
        // Tu código aquí
        for (Contacto c : contactos) {
            if (nombre.equals(c.getNombre())) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    // 👉 EJERCICIO B:
    // Implementa este método: busca el TELÉFONO de un contacto por nombre.
    // Si el contacto existe, retorna Optional con su teléfono.
    // Si no existe, retorna Optional vacío.
    public Optional<String> buscarTelefonoPorNombre(String nombre) {
        // Tu código aquí
        // 💡 Pista: puedes usar buscarPorNombre() + map()
        return buscarPorNombre(nombre).map(c -> c.getTelefono());
    }
}
