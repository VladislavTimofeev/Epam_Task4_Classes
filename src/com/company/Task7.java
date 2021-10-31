package com.company;

public class Task7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(0,0,3,0,0,4);

        double expectedSquare = 6;
        double expectedPerimeter = 12;
        if (triangle.calculatePerimeter() == expectedPerimeter) {
            Util.print("Периметр верный "+ expectedPerimeter);
        }
        if (triangle.calculateSquare() == expectedSquare) {
            Util.print("Площадь верна "+ expectedSquare);
        }

        Triangle triangle2 = new Triangle(1,1,2,4,4,2);
        Point point = triangle2.getMedianIntersectionPoints();
        Util.print(point.toString());

    }
}
