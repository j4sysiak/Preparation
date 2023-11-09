package com.company.shapes;

import com.company.IShape;

public class Triangle  /*extends Shape*/ implements IShape {

    int a, b;

    public Triangle(int a, int b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public void render() {
        System.out.println("Render Triangle ... ");
    }
}
