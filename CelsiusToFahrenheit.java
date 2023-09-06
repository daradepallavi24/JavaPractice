package com.demo;
import java.util.Scanner;

/*/*Take input 'n'. Let's assume n = 5.

In the main method:

An instance of the Scanner class named scanner is created to read user input from the console.
The program displays the message "Enter temperature in Celsius: " using System.out.print().
The nextDouble() method of the Scanner class is used to read a double value from the user, representing the temperature in Celsius. This value is stored in the celsius variable.
The scanner.close() method is called to close the Scanner object, as it's no longer needed for input.
The program calculates the temperature in Fahrenheit using the formula (Celsius * 9/5) + 32 and stores the result in the fahrenheit variable.

Finally, the program uses System.out.println() to display the calculated temperature in Fahrenheit, along with an appropriate message.*/

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
