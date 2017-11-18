package com.github.stoton.factory;

public class NullShape extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("It isn't any known shape.");
    }

    @Override
    public boolean isNull() {
        return true;
    }

}
