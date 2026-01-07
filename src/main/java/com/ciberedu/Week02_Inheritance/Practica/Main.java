package com.ciberedu.Week02_Inheritance.Practica;


import com.ciberedu.Week02_Inheritance.Practica.E1.Estudiante;
import com.ciberedu.Week02_Inheritance.Practica.E1.Persona;
import com.ciberedu.Week02_Inheritance.Practica.E11.Report;
import com.ciberedu.Week02_Inheritance.Practica.E11.TextDocument;
import com.ciberedu.Week02_Inheritance.Practica.E12.Address;
import com.ciberedu.Week02_Inheritance.Practica.E12.Employee;
import com.ciberedu.Week02_Inheritance.Practica.E13.Circle;
import com.ciberedu.Week02_Inheritance.Practica.E13.Rectangle;
import com.ciberedu.Week02_Inheritance.Practica.E2.Empleado;
import com.ciberedu.Week02_Inheritance.Practica.E2.EmpleadoTiempoCompleto;
import com.ciberedu.Week02_Inheritance.Practica.E3.CuentaAhorro;
import com.ciberedu.Week02_Inheritance.Practica.E4.ProductoPerecible;
import com.ciberedu.Week02_Inheritance.Practica.E5.Laptop;
import com.ciberedu.Week02_Inheritance.Practica.E6.Carro;
import com.ciberedu.Week02_Inheritance.Practica.E6.Motocicleta;
import com.ciberedu.Week02_Inheritance.Practica.E7.Gato;
import com.ciberedu.Week02_Inheritance.Practica.E7.Perro;
import com.ciberedu.Week02_Inheritance.Practica.E8.A;
import com.ciberedu.Week02_Inheritance.Practica.E8.B;
import com.ciberedu.Week02_Inheritance.Practica.E8.C;
import com.ciberedu.Week02_Inheritance.Practica.E9.Child;
import com.ciberedu.Week02_Inheritance.Practica.E10.Children;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // PRACTICA 1:
        // Estudiante extends Persona
        System.out.println("Practica 1:");
        Persona p1 = new Persona("Daniel", "85296314", 28);
        Estudiante e1 = new Estudiante("Kevin", "45612354", 25, "KO-202");

        p1.describe();
        e1.describe();

        // PRACTICA 2:
        // EmpleadoTiempoCompleto extends Empleado
        System.out.println("Practica 2:");
        Empleado emp1 = new Empleado("123", "Robert", 1250);
        EmpleadoTiempoCompleto emptc1 = new EmpleadoTiempoCompleto("321", "John", 1300, 100);

        System.out.println(emp1.getBaseSalary());

        System.out.println(emptc1.getBaseSalary());
        System.out.println(emptc1.getTotalPay());

        // PRACTICA 3:
        // CuentaAhorro extends CuentaBancaria
        System.out.println("Practica 3:");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("Jose", 1000, 0.03);

        System.out.println(cuentaAhorro.getBalance());
        cuentaAhorro.applyInterest();
        System.out.println(cuentaAhorro.getBalance());
        cuentaAhorro.applyInterest();
        System.out.println(cuentaAhorro.getBalance());

        // PRACTICA 4:
        // ProductoPerecible extends Producto
        System.out.println("Practica 4:");
        ProductoPerecible proper = new ProductoPerecible("Leche", 10.20, LocalDate.of(2024, 10, 3));

        System.out.println(proper.isExpired());

        // PRACTICA 5:
        // Laptop extends Dispositivo
        System.out.println("Practica 5:");
        Laptop laptop = new Laptop("DELL", "SN-1230", 32, 990);
        laptop.specs();

        // PRACTICA 6:
        // Carro, Motocicleta extends Vehiculo
        System.out.println("Practica 6:");
        Carro car1 = new Carro("Toyota", "Yaris", 2014, 4);
        Motocicleta moto1 = new Motocicleta("Yamaha", "R120", 2018, false);

        car1.info();
        moto1.info();

        // PRACTICA 7:
        // Perro, Gato extends Animal
        System.out.println("Practica 7:");
        Perro chato = new Perro("chato", 10, "Pequines");
        Gato pisco = new Gato("pisco", 12, true);

        chato.describe();
        pisco.describe();

        // PRACTICA 8:
        // C extends B, B extends A
        System.out.println("Practica 8:");
        System.out.println("A:");
        A a = new A();
        System.out.println("B:");
        B b = new B();
        System.out.println("C:");
        C c = new C();


        // PRACTICA 9:
        // Child extends Base
        System.out.println("Practica 9:");
        Child child = new Child();
        child.intentarAcceso();

        // PRACTICA 10:
        // Children extends Parent
        System.out.println("Practica 10:");
        Children children = new Children();

        children.imprimir();

        // PRACTICA 11:
        // Report extends TextDocument
        System.out.println("Practica 11:");
        TextDocument td = new TextDocument("Prueba", "Hola, esto es una prueba para contar palabras");
        Report rp = new Report("Reporte Prueba", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Unknown", "IT");

        System.out.println(td.wordCount());
        System.out.println(rp.wordCount());
        rp.printHeader();

        // PRACTICA 12:
        System.out.println("Practica 12:");
        Address address = new Address("Cayran", "Lima");
        Employee employee = new Employee(address, "123");

        employee.fullInfo();

        // PRACTICA 13:
        //
        System.out.println("Practica 13:");
        Circle circle = new Circle("Red", 20);
        Rectangle rectangle = new Rectangle("Blue", 100, 50);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
