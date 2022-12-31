package com.company.modulelevel;

import lombok.*;

@Getter
@AllArgsConstructor
public abstract class Shape {

    public ShapeType shapeType;

    public abstract void render();

}
