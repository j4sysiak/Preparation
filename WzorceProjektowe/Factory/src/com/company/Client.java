package com.company;

public class Client {

    public static void main(String[] args) throws Exception {

    /*
    Udostępniany jest interface Shape do tworzenia obiektów w ramach klasy bazowej.
    Jednocześnie pozwala podklasom zmieniać typ tworzonych obiektów.

    Fabryka oddziela kod implementacyjny (tworzący dany obiekt) od kodu, który korzysta z tego obiektu.
    Dodanie nowego kształtu nie powoduje zmiany kodu klienta - dodajemy tylko w fabryce nowy case i budujemy klasę nowego obiektu.
    */

        var shapeFactory = new ShapeFactory();

        var circle = shapeFactory.createShape(ShapeType.Circle);
        circle.render();

        var triangle = shapeFactory.createShape(ShapeType.Triangle);
        triangle.render();

        var rectangle = shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.render();
    }
}
