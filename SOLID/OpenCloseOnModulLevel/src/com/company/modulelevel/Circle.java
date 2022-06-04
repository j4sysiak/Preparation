package com.company.modulelevel;

import lombok.*;

@Builder
@Getter
@Setter
public class Circle extends Shape {
    public int radius;
    public Point center;

    public static Circle create(int radius, Point center) {
        return Circle.builder()
                .radius(radius)
                .center(center)
                .build();
    }
}
