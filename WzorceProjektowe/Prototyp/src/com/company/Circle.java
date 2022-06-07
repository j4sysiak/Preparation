package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Circle extends Shape {
    public int radius;

    @Builder
    public Circle(int radius, int x, int y, Border border) {
        super(x, y, border);
        this.radius = radius;
    }

    public static Circle create(int r, int x, int y, Border border) {
        return Circle.builder()
                .radius(r)
                .x(x)
                .y(y)
                .border(border)
                .build();
    }

    @Override
    public void render() {
        System.out.println("Render Circle ...");
    }

    @Override
    public Shape cloning() {
        return (Circle) this.clone();  //deepCopy
    }

    @Override
    //deepCopy
    public Object clone() {
        Circle circle = null;
        try {
            //Note that the super.clone() call returns a shallow copy of an object,
            // but we set deep copies of mutable fields manually, so the result is correct:
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            //only shallow clone
            circle = new Circle(
                    this.radius, this.x, this.y, this.getBorder());
        }
        //deep clone
        circle.border = (Border) this.border.clone();
        return circle;
    }
}
