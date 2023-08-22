package org.example;

import java.util.Objects;

public class Circle extends Shape {
    static final int NUM_OF_CORNERS = 0;
    static final double PI = 3.14;
    private int radius;
    private int perimeter;
    private double square;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public int getNumberOfCorners() {
        return NUM_OF_CORNERS;
    }

    @Override
    public int getPerimeter() {
        perimeter = (int) (2 * PI * radius);
        return perimeter;
    }

    @Override
    public double getSquare() {
        square = PI * Math.pow(radius, 2);
        return square;
    }

    @Override
    public String toString() {
        return "Shape: " + getName() + ", number of corners: " + getNumberOfCorners() +
                ", perimeter = " + getPerimeter() + ", square = " + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode(){
        return Objects.hash(radius);
    }

    public int getRadius() {
        return radius;
    }
}
