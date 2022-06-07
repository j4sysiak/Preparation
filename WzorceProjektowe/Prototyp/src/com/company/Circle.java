package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Circle extends Shape {

    public int radius;
    public int x;
    public int y;

    @Override
    public void render() {
        System.out.println("Render Circle ...");
    }

    @Override
    public Shape cloning() throws CloneNotSupportedException {
       return (Circle) this.clone();  //shallowCopy
    }
}
