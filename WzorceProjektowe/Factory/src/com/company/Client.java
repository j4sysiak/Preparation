package com.company;

public class Client {

    public static void main(String[] args) throws Exception {

        //Fabryka oddziela kod implementacyjny (tworzący dany obiekt) od kodu, który korzysta z tego obiektu
        //dodanie nowego kształtu nie powoduje zmiany kodu klienta - dodajemy tylko w fabryce nowy case i budujemy klasę nowego obiektu

        var shapeFactory = new ShapeFactory();

        var circle = shapeFactory.createShape(ShapeType.Circle);
        circle.render();

        var triangle = shapeFactory.createShape(ShapeType.Triangle);
        triangle.render();

        var rectangle = shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.render();
    }
}
