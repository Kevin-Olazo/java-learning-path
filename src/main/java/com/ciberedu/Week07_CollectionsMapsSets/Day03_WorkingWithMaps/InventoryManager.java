package com.ciberedu.Week07_CollectionsMapsSets.Day03_WorkingWithMaps;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    // 1
    private Map<String, Integer> inventory = new HashMap<>();

    // Method para añadir o actualizar stock
    public void addStock(String product, int quantity) {
        // TODO: Si el producto ya existe, suma la cantidad al stock actual.
        // PISTA: Usa getOrDefault para obtener el stock actual de forma segura.
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    // Method para eliminator un producto completamente
    public void removeProduct(String product){
        // TODO: Elimina el producto del mapa
        inventory.remove(product);
    }

    // Method para verificar stock de un producto específico
    public int checkStock(String product){
        // TODO: Devuelve el stock actual. Si no existe, devuelve 0.
        return inventory.getOrDefault(product, 0);
    }

    // Method para imprimir todo el inventario
    public void printFullInventory(){
        System.out.println("--- Inventario Actual ---");
        // TODO: Usa entrySet() para recorrer el mapa e imprimir "Producto: [Nombre] | Stock: [Cantidad]"
        for (Map.Entry<String, Integer> entry : inventory.entrySet()){
            System.out.println("Producto: " + entry.getKey() + " | Stock: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Pruebas básicas
        manager.addStock("Laptop", 5);
        manager.addStock("Mouse", 10);
        manager.addStock("Laptop", 2); // Debería subir a 7

        manager.printFullInventory();

        System.out.println("Stock de Mouse: " + manager.checkStock("Mouse"));
        System.out.println("Stock de Teclado (No existe): " + manager.checkStock("Teclado"));
    }

}
