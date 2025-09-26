package com.example.konoha;

public class Cylinder extends Shape {
    private int radius;
    private int height;
    public Cylinder(int x, int y) {
        super(x, y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
