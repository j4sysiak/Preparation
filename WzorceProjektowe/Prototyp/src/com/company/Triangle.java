package com.company;

public class Triangle extends Shape {
    @Override
    public void render() {
        System.out.println("Render Triangle ...");
    }

    @Override
    public Shape cloning() throws CloneNotSupportedException {
       return  (Shape) clone();
    }

    @Override
    public Object clone()  throws CloneNotSupportedException{
       return super.clone();
    }
}
