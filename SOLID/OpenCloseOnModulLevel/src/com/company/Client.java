package com.company;

import com.company.modulelevel.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Rectangle.create(ShapeType.Rectangle, 100, 200, Point.create(1, 1));
        Circle.create(ShapeType.Circle, 22, Point.create(22, 22));

        System.out.println("ssssssssssssss");
    }
}
