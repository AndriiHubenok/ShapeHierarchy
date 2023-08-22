package org.example;

import java.util.Objects;

public class Quad extends Shape {
    static final int NUM_OF_CORNERS = 4;
    private int firstDiagonal;
    private int secondDiagonal;
    private double cornerBetweenDiagonals;
    private int perimeter;
    private double square;
    private int[] sides = new int[4];

    public Quad(int[] sides) {
        for(int i = 0; i < this.sides.length; i++) {
            this.sides[i] = sides[i];
        }
    }
    @Override
    public String getName() {
        return "quad";
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
        return firstDiagonal * secondDiagonal * Math.sin(cornerBetweenDiagonals);
    }

    public boolean isSquare() {
        int side = sides[0];
        for(int i = 1; i < sides.length; i++) {
            if(side != sides[i]){
                return false;
            }
        }
        return true;
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
        Quad quad = (Quad) o;
        int count = 0;
        for(int i = 0; i < sides.length; i++) {
            if(count == 4){
                return true;
            }
            if(sides[i] == quad.sides[count]) {
                quad.sides[count] = 0;
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

    public int getFirstDiagonal() {
        return firstDiagonal;
    }

    public int getSecondDiagonal() {
        return secondDiagonal;
    }

    public double getCornerBetweenDiagonals() {
        return cornerBetweenDiagonals;
    }

    public void setDiagonals(int firstDiagonal, int secondDiagonal) {
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    public void setCornerBetweenDiagonals(double cornerBetweenDiagonals) {
        this.cornerBetweenDiagonals = cornerBetweenDiagonals;
    }
}
