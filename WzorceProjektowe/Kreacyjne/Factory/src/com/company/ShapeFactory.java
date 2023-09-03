package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Triangle;

public class ShapeFactory {

    public IShape /* może tez byc alternatywniw klasa astrakcyjna: Shape */ createShape(ShapeType type) throws Exception {
        // public Shape /* może tez byc alternatywniw klasa astrakcyjna: Shape */ createShape(ShapeType type) throws Exception {


        /* banalne co ...*/
        switch (type) {
            case Circle: return new Circle();
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            default: throw new Exception("Shape type not handled");
        }
    }
}
