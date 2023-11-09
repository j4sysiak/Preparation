package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Triangle;

public class ShapeFactory {

    public IShape /*lub Shape*/ createShape(ShapeType type) throws Exception {

        Circle circle1 = new Circle();
        var circle2 = new Circle();
        /* ciekawostka ...*/
        IShape circle3 = new Circle();

        /* banalne co ...*/
        switch (type) {
            case Circle: return new Circle();
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            default: throw new Exception("Shape type not handled");
        }
    }
}
