package com.company;

public class ShapeFactory {

    public Shape createShape(ShapeType type) throws Exception {
        switch (type) {
            case Circle: return new Circle();
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            default: throw new Exception("Shape type not handled");
        }
    }
}
