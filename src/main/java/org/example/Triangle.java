package org.example;

import java.util.Objects;

public class Triangle extends Shape {
    static final int NUM_OF_CORNERS = 3;
    private int perimeter;
    private double square;
    private int[] sides = new int[3];

    public Triangle(int[] sides) {
        for(int i = 0; i < this.sides.length; i++) {
            this.sides[i] = sides[i];
        }
    }
    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public int getNumberOfCorners() {
        return NUM_OF_CORNERS;
    }

    @Override
    public int getPerimeter() {
        perimeter = 0;
        for(int side: sides) {
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    public double getSquare() {
        int p = this.getPerimeter() / 2;
        square = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        return square;
    }

    @Override
    public String toString() {
        return "Shape: " + getName() + ", number of corners: " + getNumberOfCorners() +
                ", perimeter = " + getPerimeter() +  ", square = " + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        int count = 0;
        for(int i = 0; i < sides.length; i++) {
            if(count == 3){
                return true;
            }
            if(sides[i] == triangle.sides[count]) {
                triangle.sides[count] = 0;
                count++;
                i = 0;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(sides);
    }

    public int[] getSides() {
        return sides;
    }
}
