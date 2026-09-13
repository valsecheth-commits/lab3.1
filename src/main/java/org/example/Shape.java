package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Shape {
    public static final String DEFAULT_COLOR = "blackPink";

    String color;

    abstract void erase();
    abstract void draw();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
}
