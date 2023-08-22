package org.example;

import java.util.Objects;

public class Pentagon extends Shape {
    static final int NUM_OF_CORNERS = 5;
    private int apothem;
    private int perimeter;
    private double square;
    private int[] sides = new int[5];

    public Pentagon(int[] sides) {
        for(int i = 0; i < this.sides.length; i++) {
            this.sides[i] = sides[i];
        }
    }
    @Override
    public String getName() {
        return "pentagon";
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
        Pentagon pentagon = (Pentagon) o;
        int count = 0;
        for(int i = 0; i < sides.length; i++) {
            if(count == 5){
                return true;
            }
            if(sides[i] == pentagon.sides[count]) {
                pentagon.sides[count] = 0;
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
