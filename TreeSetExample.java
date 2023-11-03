package com.collectiondemo;

/*The code is part of a package named "com.collectiondemo," which indicates the package structure.
 * It imports the necessary Java class TreeSet from the java.util package.
 * In the main method:a. A TreeSet named treeSet is created to store integers.
 *  A TreeSet is a sorted set, so elements are automatically sorted in ascending order when added.
 *  b. Several integers (5, 2, 9, 1, and 7) are added to the treeSet using the add method.
 *  c. The code then iterates through the elements in the treeSet using a for-each loop. 
 *  For each element, it checks whether it is less than 7, and if so, it prints the number.*/

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(7);

        // Find and print numbers less than 7
        System.out.println("Numbers less than 7 in the TreeSet:");
        for (Integer number : treeSet) {
            if (number < 7) {
                System.out.println(number);
            }
        }
    }
}
