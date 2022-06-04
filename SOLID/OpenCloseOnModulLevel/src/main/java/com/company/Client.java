package com.company;

import com.company.modulelevel.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        Rectangle rectangle = Rectangle.create(ShapeType.Rectangle, 100, 200, Point.create(1, 1));
        Circle circle = Circle.create(ShapeType.Circle, 22, Point.create(22, 22));

        Application app = new Application();
        app.render(new ArrayList<>(Arrays.asList(rectangle, circle)));
        System.out.println("ssssssssssssss");
    }
}
