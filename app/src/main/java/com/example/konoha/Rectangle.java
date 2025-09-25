package com.example.konoha;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int x, int y, int width, int length){
        super(x, y);
        this.width = width;
        this.length = length;
    }
}
