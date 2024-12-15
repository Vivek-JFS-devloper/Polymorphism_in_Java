package com.polymorphism;

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class DrawingApp {

    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw(); // Output: Drawing a Circle

        shape = new Rectangle();
        shape.draw(); // Output: Drawing a Rectangle

        shape = new Triangle();
        shape.draw(); // Output: Drawing a Triangle
    }
}
