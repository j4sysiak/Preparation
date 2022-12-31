package com.company.modulelevel.model;

import lombok.*;

@Getter
@AllArgsConstructor
public abstract class Shape {

   // public ShapeType shapeType;

    public abstract void render();

}
