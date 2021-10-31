package com.company;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class Triangle {
    private final Point pointA;
    private final Point pointB;
    private final Point pointC;

    Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        this.pointA = new Point(ax, ay);
        this.pointB = new Point(bx, by);
        this.pointC = new Point(cx, cy);
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public double calculateSquare() {
        double halfPerimeter = getHalfPerimeter();
        double underSqrt = halfPerimeter * (halfPerimeter - getA()) *
                (halfPerimeter - getB()) * (halfPerimeter - getC());
        double square = Math.sqrt(underSqrt);
        return square;
    }

    public double calculatePerimeter() {
        double perimeter = getA() + getB() + getC();
        return perimeter;
    }

    public double getHalfPerimeter() {
        return calculatePerimeter() / 2;
    }

    public Point getMedianIntersectionPoints() {

        Point medianAF_BC = new Point(
                (pointB.getX()+pointC.getX())/2,
                (pointB.getY()+pointC.getY())/2
        );

        Point medianBZ_AC = new Point(
                (pointA.getX()+pointC.getX())/2,
                (pointA.getY()+pointC.getY())/2
        );

        Point medianCH_AB = new Point(
                (pointA.getX()+pointB.getX())/2,
                (pointA.getY()+pointB.getY())/2
        );

        double m2 = (medianAF_BC.getX() + medianBZ_AC.getX() + medianCH_AB.getX()) / 3.0;
        double m3 = (medianAF_BC.getY() + medianBZ_AC.getY() + medianCH_AB.getY()) / 3.0;
        return new Point(m2,m3);
    }

    public double getA() {
        return Math.sqrt(
                Math.pow(pointA.getX() - pointB.getX(), 2) +
                        Math.pow(pointA.getY() - pointB.getY(), 2)
        );
    }

    public double getB() {
        return Math.sqrt(
                Math.pow(pointA.getX() - pointC.getX(), 2) +
                        Math.pow(pointA.getY() - pointC.getY(), 2)
        );
    }

    public double getC() {
        return Math.sqrt(
                Math.pow(pointB.getX() - pointC.getX(), 2) +
                        Math.pow(pointB.getY() - pointC.getY(), 2)
        );
    }


}
