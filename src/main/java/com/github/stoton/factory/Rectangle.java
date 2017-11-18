package com.github.stoton.factory;

public class Rectangle extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("DRAW::RECTANGLE");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
