package com.company;

public class Triange extends Shape implements Cloneable {
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
