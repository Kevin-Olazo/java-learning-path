package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private final int productId;
    private String name;
    private double price;
    private int stockQuantity;
    final private LocalDate createdDate;

    public Product(int productId, String name, double price, int stockQuantity) {
        if (productId < 0) {
            throw new IllegalArgumentException("Product ID invalid.");
        }
        this.productId = productId;
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
        createdDate = LocalDate.now();
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public void getStatus() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = LocalDate.now().format(formato);
        System.out.println(
                "ID: " + productId +
                        "Producto: " + name +
                        "Precio: " + price +
                        "Stock actual: " + stockQuantity +
                        "Creado el: " + fechaFormateada
        );
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty.");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("stock cannot be negative.");
        }
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
