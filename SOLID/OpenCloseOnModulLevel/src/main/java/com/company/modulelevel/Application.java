package com.company.modulelevel;

import java.util.List;

public class Application {

    public void render(List<Shape> shapes) {
        for (Shape shape : shapes) {
            ShapeType type = shape.shapeType;
            switch (type) {
                case Circle:
                    renderCircle((Circle)shape);
                    break;
                case Rectangle:
                    renderRectangle((Rectangle)shape);
                    break;
                default: return;
            }
        }
    }

    private void renderRectangle(Rectangle rectangle) {
        System.out.println("Render Rectangle ...");
    }

    private void renderCircle(Circle circle) {
        System.out.println("Render Circle ...");
    }
}
