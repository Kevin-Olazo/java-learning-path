package com.ciberedu.Week02_Inheritance.Practica.E4;

import java.time.LocalDate;

public class ProductoPerecible extends Producto {
    private LocalDate expirationDate;

    public ProductoPerecible(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return !LocalDate.now().isBefore(expirationDate); // Hoy o Después;
    }
}
