package com.ciberedu.Week02_Inheritance.Practica;


import com.ciberedu.Week02_Inheritance.Practica.E1.Estudiante;
import com.ciberedu.Week02_Inheritance.Practica.E1.Persona;
import com.ciberedu.Week02_Inheritance.Practica.E2.Empleado;
import com.ciberedu.Week02_Inheritance.Practica.E2.EmpleadoTiempoCompleto;
import com.ciberedu.Week02_Inheritance.Practica.E3.CuentaAhorro;
import com.ciberedu.Week02_Inheritance.Practica.E4.ProductoPerecible;
import com.ciberedu.Week02_Inheritance.Practica.E5.Laptop;
import com.ciberedu.Week02_Inheritance.Practica.E6.Carro;
import com.ciberedu.Week02_Inheritance.Practica.E6.Motocicleta;

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
        ProductoPerecible proper = new ProductoPerecible("Leche", 10.20, LocalDate.of(2024,10,3));

        System.out.println(proper.isExpired());

        // PRACTICA 5:
        // Laptop extends Dispositivo
        System.out.println("Practica 5:");
        Laptop laptop = new Laptop("DELL", "SN-1230", 32, 990);
        laptop.specs();

        // PRACTICA 6:
        // Carro, Motocicleta extends Vehiculo
        System.out.println("Practica 6:");
        Carro car1 = new Carro("Toyota", "Yaris", 2014,4);
        Motocicleta moto1 = new Motocicleta("Yamaha", "R120", 2018, false);

        car1.info();
        moto1.info();


    }
}
