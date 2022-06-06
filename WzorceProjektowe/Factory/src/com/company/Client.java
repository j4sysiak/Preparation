package com.company;

import com.company.mdel.Circle;

public class Client {

    public static void main(String[] args) throws Exception {

    /*
    Udostępniany jest interface IShape (lub lasa abstrakcyjna Shape) do tworzenia obiektów w ramach klasy bazowej.
    Jednocześnie pozwala podklasom zmieniać typ tworzonych obiektów.

    Fabryka oddziela kod implementacyjny (tworzący dany obiekt) od kodu, który korzysta z tego obiektu.
    Dodanie nowego kształtu nie powoduje zmiany kodu klienta - dodajemy tylko w fabryce nowy case i budujemy klasę nowego obiektu.
    */

        var shapeFactory = new ShapeFactory();

        //Circle circle = (Circle) shapeFactory.createShape(ShapeType.Circle);
        var circle = shapeFactory.createShape(ShapeType.Circle);
        circle.render();

        // Triangle triangle = (Triangle) shapeFactory.createShape(ShapeType.Triangle);
        var triangle = shapeFactory.createShape(ShapeType.Triangle);
        triangle.render();

        // Rectangle rectangle = (Rectangle) shapeFactory.createShape(ShapeType.Rectangle);
        var rectangle = shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.render();
    }
}
