package com.company.modulelevel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Shape {
    public ShapeType shapeType;

    public static Shape create(ShapeType shapeType) {
        return Shape.builder()
                .shapeType(shapeType)
                .build();
    }
}
