package com.ciberedu.Week02_Inheritance.Practica.E2;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonus;

    public EmpleadoTiempoCompleto(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        if (bonus < 0) throw new IllegalArgumentException("Bonus no puede ser negativo");
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalPay() {
        return getBaseSalary() + bonus;
    }
}
