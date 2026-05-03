abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    final double PI = 3.1416;
    public double radius;

    public Circle(double radiusIn) {
        radius = radiusIn;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double lengthIn, double widthIn) {
        length = lengthIn;
        width = widthIn;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Shape {
    public double side;

    public Square(double sideIn) {
        side = sideIn;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    public double base;
    public double height;

    public Triangle(double baseIn, double heightIn) {
        base = baseIn;
        height = heightIn;
    }

    @Override
    public double getArea() {
        return (1.0 / 2.0 * base * height);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(3, 3);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3, 8);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());

    }
}