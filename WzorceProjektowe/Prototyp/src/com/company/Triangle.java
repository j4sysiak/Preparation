package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Triangle extends Shape {

    @Builder
    public Triangle(int x, int y, Border border) {
        super(x, y, border);
    }

    public static Triangle create(int x, int y, Border border) {
        return Triangle.builder()
                .x(x)
                .y(y)
                .border(border)
                .build();
    }

    @Override
    public void render() {
        System.out.println("Render Triangle ...");
    }

    @Override
    public Shape cloning() throws CloneNotSupportedException {
        return (Triangle) this.clone();  //deepCopy
    }

    @Override
    //deepCopy
    public Object clone() {
        Triangle triangle = null;
        try {
            //Note that the super.clone() call returns a shallow copy of an object,
            // but we set deep copies of mutable fields manually, so the result is correct:
            triangle = (Triangle) super.clone();
        } catch (CloneNotSupportedException e) {
            //shallow clone
            triangle = new Triangle(
                    this.x, this.y, this.getBorder());
        }
        //deep cloce
        triangle.border = (Border) this.border.clone();
        return triangle;
    }
}
