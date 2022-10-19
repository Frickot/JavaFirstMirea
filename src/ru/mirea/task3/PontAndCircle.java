package ru.mirea.task3.lab3;
import java.util.Scanner;
class Circle {
    Integer radius;
    Point center;

    Integer getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public double circleArea() {
        return Math.PI * radius * radius;
    }

    public double circleLength() {
        return 2 * Math.PI * radius;
    }

    public Circle(Integer radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
}


class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class TestPointAndCircle {
    public static void test() {
        Point centerPoint = new Point(12.4, -3.4);
        Circle smallCircle = new Circle(5, centerPoint);
        System.out.println(smallCircle.getRadius());
        Scanner scan = new Scanner(System.in);
        int newRadius = scan.nextInt();
        smallCircle.setRadius(newRadius);
        System.out.println(smallCircle.getRadius());
    }
}