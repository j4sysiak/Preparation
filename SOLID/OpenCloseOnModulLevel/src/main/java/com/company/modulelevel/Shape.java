package com.company.modulelevel;

import lombok.*;

@Getter
@AllArgsConstructor
public  class Shape {
    public ShapeType shapeType;
    public void render(){};
}
