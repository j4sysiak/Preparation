package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {

    public int x;
    public int y;

    public abstract void render();
}
