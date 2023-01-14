package com.company;

import com.company.mdel.Circle;
import com.company.mdel.Rectangle;
import com.company.mdel.Triangle;

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
