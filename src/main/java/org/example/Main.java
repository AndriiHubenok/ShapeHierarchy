package org.example;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1, 6};
        int[] numbersTwo = {5, 3, 4, 2, 6, 1};

        Circle circle = new Circle(6);
        Circle circleTwo = new Circle(7);
        Pentagon pentagon = new Pentagon(numbers);
        Pentagon pentagonTwo = new Pentagon(numbersTwo);
        Hexagon hexagon = new Hexagon(numbers);
        Hexagon hexagonTwo = new Hexagon(numbersTwo);
        Quad quad = new Quad(numbers);
        Quad quadTwo = new Quad(numbersTwo);
        Triangle triangle = new Triangle(numbers);
        Triangle triangleTwo = new Triangle(numbers);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println(circle.equals(circleTwo));
        System.out.println(circle.hashCode());
        System.out.println(circleTwo.hashCode());

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
        System.out.println(triangle.equals(triangleTwo));
        System.out.println(triangle.hashCode());
        System.out.println(triangleTwo.hashCode());

        System.out.println(quad.getPerimeter());
        quad.setDiagonals(5, 4);
        quad.setCornerBetweenDiagonals(3.14 / 6);
        quadTwo.setDiagonals(6, 5);
        quadTwo.setCornerBetweenDiagonals(3.14 / 6);
        System.out.println(quad.toString());
        System.out.println(quad.equals(quadTwo));
        System.out.println(quad.hashCode());
        System.out.println(quadTwo.hashCode());

        System.out.println(pentagon.getPerimeter());
        pentagon.setApothem(3);
        pentagonTwo.setApothem(4);
        System.out.println(pentagon.toString());
        System.out.println(pentagon.equals(pentagonTwo));
        System.out.println(pentagon.hashCode());
        System.out.println(pentagonTwo.hashCode());

        System.out.println(hexagon.getPerimeter());
        hexagon.setApothem(3);
        hexagonTwo.setApothem(4);
        System.out.println(hexagon.toString());
        System.out.println(hexagon.equals(hexagonTwo));
        System.out.println(hexagon.hashCode());
        System.out.println(hexagonTwo.hashCode());
    }
}