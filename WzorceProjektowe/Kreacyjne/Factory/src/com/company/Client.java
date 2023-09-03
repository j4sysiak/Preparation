package com.company;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() throws Exception {

    /*
    Udostępniany jest interface IShape (lub klasa abstrakcyjna Shape) do tworzenia obiektów w ramach klasy bazowej.
    Jednocześnie pozwala podklasom zmieniać typ tworzonych obiektów.

    Fabryka oddziela kod implementacyjny (ShapeFactory: tworzący dany obiekt) od kodu, który korzysta z tego obiektu - Clienta.
    Dodanie nowego kształtu nie powoduje zmiany kodu klienta (klasa Client)
                - dodajemy tylko w fabryce (ShapeFactory) nowy case i budujemy klasę nowego obiektu.
    */


        var shapeFactory = new ShapeFactory();

        // Circle circle = (Circle) shapeFactory.createShape(ShapeType.Circle);
        IShape circle = shapeFactory.createShape(ShapeType.Circle);
        circle.render();

        // Triangle triangle = (Triangle) shapeFactory.createShape(ShapeType.Triangle);
        var triangle = shapeFactory.createShape(ShapeType.Triangle);
        triangle.render();

        // Rectangle rectangle = (Rectangle) shapeFactory.createShape(ShapeType.Rectangle);
        var rectangle = shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.render();
    }
}
