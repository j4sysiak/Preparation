package com.company.shapes;

import com.company.IShape;

public class Circle /*extends Shape*/ implements IShape {

    public Circle(int i, int i1) {
    }

    @Override
    public void render() {
        System.out.println("Render Circle ... ");
    }
}
