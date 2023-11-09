package com.company.shapes;

import com.company.IShape;

public class Rectangle  /*extends Shape*/ implements IShape {

    @Override
    public void render() {
        System.out.println("Render Rectangle ... ");
    }
}
