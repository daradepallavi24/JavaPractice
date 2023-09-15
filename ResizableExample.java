package com.Interface.demo;

//Define the Resizable interface
interface Resizable {
 void resizeWidth(int width);
 void resizeHeight(int height);
}

//Implement the Resizable interface in the Rectangle class
class Rectangle implements Resizable {
 private int width;
 private int height;

 public Rectangle(int width, int height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public void resizeWidth(int width) {
     this.width = width;
 }

 @Override
 public void resizeHeight(int height) {
     this.height = height;
 }

 public void display() {
     System.out.println("Rectangle: Width = " + width + ", Height = " + height);
 }
}

public class ResizableExample {
 public static void main(String[] args) {
     // Create a Rectangle object
     Rectangle rectangle = new Rectangle(10, 20);

     // Display the initial state of the rectangle
     System.out.println("Initial Rectangle:");
     rectangle.display();

     // Resize the rectangle
     rectangle.resizeWidth(15);
     rectangle.resizeHeight(25);

     // Display the resized rectangle
     System.out.println("\nResized Rectangle:");
     rectangle.display();
 }
}

