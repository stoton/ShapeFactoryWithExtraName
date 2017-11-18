package com.github.stoton.factory;

public class Square extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("DRAW::SHAPE");
    }

    @Override
    public boolean isNull() {
        return false;
    }

}
