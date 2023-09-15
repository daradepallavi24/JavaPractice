package com.Interface.demo;

/*We define a class named Rectangle. This class is used to represent rectangles and perform operations on them.
 * Inside the Rectangle class, we declare two private integer instance variables: length and width. These variables will hold the dimensions of the rectangle.
 * We have a constructor for the Rectangle class that takes two integer parameters: length and width. 
 * This constructor is used to initialize the instance variables with the values provided as arguments.
 * The this.length and this.width expressions inside the constructor are used to refer to the instance variables of the current object (this represents the current object). 
 * This distinction is necessary because the parameter names have the same names as the instance variables.
 * The calculateArea method calculates the area of the rectangle by multiplying its length and width. It returns the result as an integer.
 * Here again, we use this to specify that we are referring to the instance variables length and width rather than any local variables that might have the same names.
 * In the main method, we create an instance of the Rectangle class called rectangle with the dimensions 5 for length and 4 for width.
 * We then call the calculateArea method on the rectangle object to calculate its area and store the result in the area variable.
 * Finally, we print out the calculated area using System.out.println.
 * */

public class ThisRectangle {
    // Instance variables
    private int length;
    private int width;

    // Constructor
    public ThisRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        // Use "this" to access instance variables
        return this.length * this.width;
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        ThisRectangle rectangle = new ThisRectangle(5, 4);

        // Calculate and display the area
        int area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
}

