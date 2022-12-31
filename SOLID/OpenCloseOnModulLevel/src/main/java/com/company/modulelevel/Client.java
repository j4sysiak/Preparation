package com.company.modulelevel;

import com.company.modulelevel.model.Circle;
import com.company.modulelevel.model.Point;
import com.company.modulelevel.model.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = Rectangle.create(ShapeType.Rectangle, 100, 200, Point.create(1, 1));
        Circle circle = Circle.create(ShapeType.Circle, 22, Point.create(22, 22));

        Application.render(new ArrayList<>(Arrays.asList(rectangle, circle)));
        System.out.println("koniec");
    }
}
