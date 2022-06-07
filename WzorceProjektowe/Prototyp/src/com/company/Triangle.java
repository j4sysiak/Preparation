package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Shape {

    @Override
    public void render() {
        System.out.println("Render Triangle ...");
    }

    @Override
    public Shape cloning() throws CloneNotSupportedException {
       return (Triangle) this.clone();  //shallowCopy
    }
}
