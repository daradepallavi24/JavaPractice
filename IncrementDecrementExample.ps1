package com.demo;

/*
 * int a = 5; - Initialize variable a with the value 5.
 * int b = 10; - Initialize variable b with the value 10.
 * int preIncrementResult = ++a; - Pre-increment a by 1 and assign the result to preIncrementResult.
 * a becomes 6.
 * preIncrementResult becomes 6.
 * System.out.println("Pre-increment: a = " + a + ", preIncrementResult = " + preIncrementResult); - Print the values of a and preIncrementResult.
 * Output: "Pre-increment: a = 6, preIncrementResult = 6"
 
 * int postIncrementResult = b++; - Post-increment b by 1 and assign the original value of b to postIncrementResult.
 * b becomes 11.
 * postIncrementResult becomes 10.
 * System.out.println("Post-increment: b = " + b + ", postIncrementResult = " + postIncrementResult); - Print the values of b and postIncrementResult.
 * Output: "Post-increment: b = 11, postIncrementResult = 10"

 * int x = 15; - Initialize variable x with the value 15.
 * int y = 20; - Initialize variable y with the value 20.
 * int preDecrementResult = --x; - Pre-decrement x by 1 and assign the result to preDecrementResult.
 * x becomes 14.
 * preDecrementResult becomes 14.
 * System.out.println("Pre-decrement: x = " + x + ", preDecrementResult = " + preDecrementResult); - Print the values of x and preDecrementResult.
 * Output: "Pre-decrement: x = 14, preDecrementResult = 14"
 
 * int postDecrementResult = y--; - Post-decrement y by 1 and assign the original value of y to postDecrementResult.
 * y becomes 19.
 * postDecrementResult becomes 20.
 * System.out.println("Post-decrement: y = " + y + ", postDecrementResult = " + postDecrementResult); - Print the values of y and postDecrementResult.
 * Output: "Post-decrement: y = 19, postDecrementResult = 20"
*/

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Pre-increment
        int preIncrementResult = ++a;
        System.out.println("Pre-increment: a = " + a + ", preIncrementResult = " + preIncrementResult);

        // Post-increment
        int postIncrementResult = b++;
        System.out.println("Post-increment: b = " + b + ", postIncrementResult = " + postIncrementResult);

        int x = 15;
        int y = 20;

        // Pre-decrement
        int preDecrementResult = --x;
        System.out.println("Pre-decrement: x = " + x + ", preDecrementResult = " + preDecrementResult);

        // Post-decrement
        int postDecrementResult = y--;
        System.out.println("Post-decrement: y = " + y + ", postDecrementResult = " + postDecrementResult);
    }
}
