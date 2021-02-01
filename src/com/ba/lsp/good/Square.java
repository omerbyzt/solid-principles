package com.ba.lsp.good;

public class Square implements Shape {
    private int size;
    public Square(int size) {
        this.size = size;
    }
    @Override
    public long area() {
        return size * size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
