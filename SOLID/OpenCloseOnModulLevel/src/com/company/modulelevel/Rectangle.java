package com.company.modulelevel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Rectangle extends Shape {
    public int widht;
    public int height;
    public Point topLeft;

    public static Rectangle create(int widht, int height, Point topLeft) {
        return Rectangle.builder()
                .widht(widht)
                .height(height)
                .topLeft(topLeft)
                .build();
    }
}
