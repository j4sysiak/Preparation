package com.company.shapes;

import com.company.IShape;

public class Rectangle  /*extends Shape*/ implements IShape {

    public Rectangle(int i, int i1) {
    }

    @Override
    public void render() {
        System.out.println("Render Rectangle ... ");
    }
}
