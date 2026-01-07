package com.ciberedu.Week02_Inheritance.Practica.E8;

public class Child extends Base {
    private String name;

    public void intentarAcceso() {
        // Intento 1: Acceder al atributo protegido
        System.out.println("Puedo ver: " + protegido);

        // Intento 2: Acceder al atributo privado
        System.out.println("Puedo ver: " + getPrivado());
    }


}
