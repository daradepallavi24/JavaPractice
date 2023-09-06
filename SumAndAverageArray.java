package com.demo;

public class SumAndAverageArray {

    public static void main(String[] args) {
        double[] numbers = { 5.5, 2.5, 8.0, 3.0, 6.5 };

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}
