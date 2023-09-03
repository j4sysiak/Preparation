package com.company.shapes;

import com.company.IShape;

public class Circle /*extends Shape*/ implements IShape {

    @Override
    public void render() {
        System.out.println("Render Circle ... ");
    }
}
