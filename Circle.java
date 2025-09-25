package com.example.konoha;

public class Circle extends Shape {
    int radius;
    public Circle(int x, int y) {
        super(x, y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
