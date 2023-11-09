package com.company.shapes;

import com.company.IShape;

public class Triangle  /*extends Shape*/ implements IShape {

    public Triangle(int i, int i1) {
    }

    @Override
    public void render() {
        System.out.println("Render Triangle ... ");
    }
}
