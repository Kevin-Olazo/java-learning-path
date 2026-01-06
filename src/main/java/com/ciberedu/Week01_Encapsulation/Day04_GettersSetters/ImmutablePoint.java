package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

public final class ImmutablePoint {
    final double x, y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
