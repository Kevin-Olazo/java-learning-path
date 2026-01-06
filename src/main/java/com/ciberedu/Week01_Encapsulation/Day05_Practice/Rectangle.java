package com.ciberedu.Week01_Encapsulation.Day05_Practice;

public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return ((width * 2) + (height * 2));
    }

    public boolean isSquare() {
        return width == height;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Error. Enter a valid width value");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Error. Enter a valid height value");
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
