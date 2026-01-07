package com.ciberedu.Week02_Inheritance.Practica.E2;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonus;

    public EmpleadoTiempoCompleto(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public double getTotalPay() {
        return getBaseSalary() + bonus;
    }
}
