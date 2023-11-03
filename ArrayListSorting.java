package com.collectiondemo;

/*The code is part of a package named "com.collectiondemo," which indicates the package structure.
 * It imports the necessary Java classes, ArrayList and Collections, from the java.util package.
 * In the main method:
 * a. An ArrayList named numbers is created to store integers.
 * b. Several integers (5, 2, 9, 1, and 7) are added to the numbers ArrayList using the add method.
 * c. The Collections.sort(numbers) method is used to sort the elements in the ArrayList in ascending order.
 * d. Finally, the sorted ArrayList is displayed using System.out.println.*/

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }
}

