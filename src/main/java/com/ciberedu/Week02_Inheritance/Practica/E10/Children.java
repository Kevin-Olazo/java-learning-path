package com.ciberedu.Week02_Inheritance.Practica.E10;

public class Children extends Parent{
    String type = "child";

    public void imprimir() {
        System.out.println(super.type);
        System.out.println(type);
    }
}
