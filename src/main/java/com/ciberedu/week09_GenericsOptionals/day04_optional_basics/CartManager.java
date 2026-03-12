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
        for(Product p : cart.getProducts()) {
            if(p.getId().equals(id)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    // TODO 2: Encuentra el producto más barato.
    // Retorna un Optional.
    public Optional<Product> findCheapest() {
        // Tu código aquí
        if (cart.getProducts().isEmpty()){
            return Optional.empty();
        }

        Product cheapest = cart.getProducts().get(0);
        for(Product p : cart.getProducts()){
            if (p.getPrice() < cheapest.getPrice()){
                cheapest = p;
            }
        }

        return Optional.of(cheapest);

    }

    // TODO 3: Usando tu método findProductById, demuestra las 4 formas de extraer/verificar.
    public void demonstrateOptional() {
        // 1. Usa isPresent() o isEmpty() con un IF tradicional para imprimir si existe el ID "A1"
        if (findProductById("A1").isPresent()){
            System.out.println("El ID A1 existe");
        }
        // 2. Intenta buscar el ID "INVENTADO". Usa orElse() para guardar un producto por defecto ("Generico", precio 0) en una variable.
        Product generico = new Product("B001", "Generico", 10.00, "INVENTADO");
        Product productoSeguro = findProductById("INVENTADO").orElse(generico);


        // 3. Intenta buscar el ID "ERROR". Usa orElseThrow() para lanzar IllegalArgumentException si no existe.
        findProductById("ERROR").orElseThrow(() -> new IllegalArgumentException("No existe"));

        // 4. Busca el ID "A1" y usa ifPresent() con una Lambda para imprimir su nombre en una sola línea.
        findProductById("A1").ifPresent( (p) -> System.out.println(p.getName()) );
    }

    // TODO 4: Compara. Escribe un método rápido findCheapestOldSchool() que retorne Product (o null) sin usar Optional, para contrastar.
    public Product findCheapestOldSchool() {
        // Tu código aquí
        if (cart.getProducts().isEmpty()){
            return null;
        }
        Product cheapest = cart.getProducts().get(0);
        for(Product p : cart.getProducts()){
            if (p.getPrice() < cheapest.getPrice()){
                cheapest = p;
            }
        }

        return cheapest;
    }
}
