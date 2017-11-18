package com.github.stoton.factory;

public class Main  {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        AbstractShape circle = shapeFactory.getShape("circle");

        circle.draw();

        AbstractShape nothing = shapeFactory.getShape("nothing");
        nothing.draw();
    }
}
