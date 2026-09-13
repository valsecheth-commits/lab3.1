package org.example;

public class Point extends Shape {
    private Coords coords;

    public Point(Coords coords) {
        this.coords = coords;
    }

    @Override
    void erase() {
        System.out.println("Point: " + getX() + " " + getY() + " erased");
    }

    @Override
    void draw() {
        System.out.println("Point: " + getX() + " " + getY() + " Color: " + getColor());
    }

    public void setX(Long x) {
        coords.x = x;
    }

    public void setY(Long y) {
        coords.y = y;
    }

    Long getX() {
        return coords.x;
    }

    Long getY() {
        return coords.y;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
