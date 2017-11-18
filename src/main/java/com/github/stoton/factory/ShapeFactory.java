package com.github.stoton.factory;

public class ShapeFactory {

    public AbstractShape getShape(String shapeType) {

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                return new NullShape();
        }


    }
}
