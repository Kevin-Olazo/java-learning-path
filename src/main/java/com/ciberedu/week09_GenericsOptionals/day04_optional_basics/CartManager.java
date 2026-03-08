package com.ciberedu.week09_GenericsOptionals.day04_optional_basics;

import java.util.Optional;

public class CartManager {
    private ShoppingCart cart;

    public CartManager(ShoppingCart cart) {
        this.cart = cart;
    }

    // TODO 1: Busca un producto por ID.
    // Si lo encuentras, retorna Optional.of(). Si no, retorna Optional.empty().
    public Optional<Product> findProductById(String id) {
        // Tu código aquí
        return null; // Cambia esto
    }

    // TODO 2: Encuentra el producto más barato.
    // Retorna un Optional.
    public Optional<Product> findCheapest() {
        // Tu código aquí
        return null; // Cambia esto
    }

    // TODO 3: Usando tu método findProductById, demuestra las 4 formas de extraer/verificar.
    public void demonstrateOptional() {
        // 1. Usa isPresent() o isEmpty() con un IF tradicional para imprimir si existe el ID "A1"

        // 2. Intenta buscar el ID "INVENTADO". Usa orElse() para guardar un producto por defecto ("Generico", precio 0) en una variable.

        // 3. Intenta buscar el ID "ERROR". Usa orElseThrow() para lanzar IllegalArgumentException si no existe.

        // 4. Busca el ID "A1" y usa ifPresent() con una Lambda para imprimir su nombre en una sola línea.
    }

    // TODO 4: Compara. Escribe un método rápido findCheapestOldSchool() que retorne Product (o null) sin usar Optional, para contrastar.
    public Product findCheapestOldSchool() {
        // Tu código aquí
        return null;
    }
}
