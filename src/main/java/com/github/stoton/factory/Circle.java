package com.github.stoton.factory;

public class Circle extends AbstractShape {


    @Override
    public void draw() {
        System.out.println("DRAW::CIRCLE");
    }

    @Override
    public boolean isNull() {
        return false;
    }

}
