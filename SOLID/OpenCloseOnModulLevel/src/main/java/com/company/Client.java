package com.company;

import com.company.modulelevel.Circle;
import com.company.modulelevel.Point;
import com.company.modulelevel.Rectangle;
import com.company.modulelevel.ShapeType;

public class Client {

    public static void main(String[] args) {

        Rectangle rectangle = Rectangle.create(ShapeType.Rectangle, 100, 200, Point.create(1, 1));
        Circle circle = Circle.create(ShapeType.Circle, 22, Point.create(22, 22));

        System.out.println("ssssssssssssss");
    }
}
