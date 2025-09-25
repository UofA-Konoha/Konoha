package com.example.konoha;

public class Square extends Shape {
    private int sideLength;
    public Square(int x, int y, int sideLength) {
        super(x, y);
    }

    public int getSideLength() {
        return sideLength;
    }
}
