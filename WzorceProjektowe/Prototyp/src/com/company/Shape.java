package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {

   public int x;
   public int y;

   public Border border;

   public abstract void render();
   public abstract Shape cloning() throws CloneNotSupportedException;
}
