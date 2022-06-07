package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {

    public int radius;

    @Override
    public void render() {
        System.out.println("Render Circle ...");
    }

    @Override
    public Shape cloning() throws CloneNotSupportedException {
       return (Circle) this.clone();  //shallowCopy
    }
}
