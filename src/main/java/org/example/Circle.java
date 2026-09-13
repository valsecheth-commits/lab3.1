package org.example;

import lombok.Getter;
import lombok.Setter;

public class Circle extends Shape {
    @Setter
    @Getter
    int radius;

    private Coords center;

    @Override
    void erase() {
        System.out.println("Circle coords" + " center: (" + getX() + ", " + getY() + "). radius: " + getRadius() + " erased");
    }

    void draw() {
        System.out.println("Circle coords" + " center: (" +  getX() + ", " + getY() + "). radius: " + getRadius() + ". Color: " + getColor());
    }
    public Circle() {
    }

    public Circle(Coords center, int radius) {
        this.center = center;
        setRadius(radius);
    }

    public void setX(Long x) {
        center.x = x;
    }

    public void setY(Long y) {
        center.y = y;
    }

    public Long getX() {
        return center.x;
    }

    public Long getY() {
        return center.y;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
