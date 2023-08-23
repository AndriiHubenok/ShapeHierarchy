package org.example;

import java.util.Objects;

public class Hexagon extends Shape {
    static final int NUM_OF_CORNERS = 6;
    private int apothem;
    private int perimeter;
    private double square;
    private int[] sides;

    public Hexagon(int[] sides) {
        this.sides = new int[6];
        System.arraycopy(sides, 0, this.sides, 0, 6);
    }
    @Override
    public String getName() {
        return "hexagon";
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
        square = getPerimeter() * apothem / 2;
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
        Hexagon hexagon = (Hexagon) o;
        int count = 0;
        for(int i = 0; i < sides.length; i++) {
            if(count == 5){
                return true;
            }
            if(sides[i] == hexagon.sides[count]) {
                hexagon.sides[count] = 0;
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

    public int getApothem(){
        return apothem;
    }
    public void setApothem(int apothem) {
        this.apothem = apothem;
    }
}
