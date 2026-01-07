package com.ciberedu.Week02_Inheritance.Practica.E9;

public class Children extends Parent{
    String type = "child";

    public void imprimir() {
        System.out.println(super.type);
        System.out.println(type);
    }
}
