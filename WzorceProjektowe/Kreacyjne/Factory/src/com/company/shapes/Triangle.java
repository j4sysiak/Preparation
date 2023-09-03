package com.company.shapes;

import com.company.IShape;

public class Triangle  /*extends Shape*/ implements IShape {

    @Override
    public void render() {
        System.out.println("Render Triangle ... ");
    }
}
