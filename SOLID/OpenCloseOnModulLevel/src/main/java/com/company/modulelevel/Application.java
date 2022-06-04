package com.company.modulelevel;

import java.util.Collection;

public class Application {


    //Jeżeli chcemy dodać nowy typ,
    // to po prostu rozszerzamy model np o klasę Triangle i w tej klasie tworzymy sfoisty render dla niej
    // wywołanie render dla nowej klasy Triangle nie powoduje rozszerzenia klasy Application (jest zamknięta na rozszerzenia) i jedncześnie otwarta na nowy typ
    //tylko do listy dopisujemy obiekt Triangle
    //Triangle triangle = Triangle.create(ShapeType.Triangle, 11, Point.create(1, 222));

    public static void render(Collection<Shape> shapes) {

    for (Shape shape : shapes) {
        shape.render();
    }

//        for (Shape shape : shapes) {
//            ShapeType type = shape.shapeType;
//            switch (type) {
//                case Circle:
//                    renderCircle((Circle)shape);
//                    break;
//                case Rectangle:
//                    renderRectangle((Rectangle)shape);
//                    break;
//                default: return;
//            }
//        }

//     shapes.stream()
//                .map(f -> {
//                    switch (f.getShapeType()) {
//                        case Circle: renderCircle((Circle)f);break;
//                        case Rectangle: renderRectangle((Rectangle)f);break;
//                    }
//                    return null;
//                })
//             .collect(Collectors.toList());


    }

//    private void renderRectangle(Rectangle rectangle) {
//        System.out.println("Render Rectangle ...");
//    }
//
//    private void renderCircle(Circle circle) {
//        System.out.println("Render Circle ...");
//    }
}
