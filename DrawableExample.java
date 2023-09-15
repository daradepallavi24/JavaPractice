package com.Interface.demo;

//Define the Drawable interface
interface Drawable {
 void draw();
}

//Implement the Drawable interface in the Circle class
class Circle implements Drawable {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a circle with radius " + radius);
 }
}

//Implement the Drawable interface in the Rectangle class
class Rectangle implements Drawable {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a rectangle with width " + width + " and height " + height);
 }
}

//Implement the Drawable interface in the Triangle class
class Triangle implements Drawable {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a triangle with base " + base + " and height " + height);
 }
}

public class DrawableExample {
 public static void main(String[] args) {
     // Create objects of different shapes and draw them
     Drawable circle = new Circle(5.0);
     Drawable rectangle = new Rectangle(4.0, 6.0);
     Drawable triangle = new Triangle(3.0, 4.0);

     // Draw the shapes
     circle.draw();
     rectangle.draw();
     triangle.draw();
 }
}

