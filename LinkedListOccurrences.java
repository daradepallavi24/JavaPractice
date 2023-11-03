package com.collectiondemo;

/*The code is part of a package named "com.collectiondemo," which indicates the package structure.
 * It imports the necessary Java class LinkedList from the java.util package.
 * In the main method:a. A LinkedList named linkedList is created to store integers.
 * b. Several integers (5, 2, 4, 2, 9, and 2) are added to the linkedList using the add method.
 * c. The integer targetElement is specified, which is the element you want to find within the linked list (in this case, it's set to 2).
 * d. The indexOf(targetElement) method is used to find the first occurrence of the targetElement in the linked list, and the result is stored in the firstIndex variable.
 * e. The lastIndexOf(targetElement) method is used to find the last occurrence of the targetElement in the linked list, and the result is stored in the lastIndex variable.
 * f. Finally, the code displays the results using System.out.println. 
 * It checks if the targetElement was found in the list and, if found, prints the indices of its first and last occurrences.*/

import java.util.LinkedList;

public class LinkedListOccurrences {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(2);

        // Specify the element to find
        int targetElement = 2;

        // Find the first occurrence of the element
        int firstIndex = linkedList.indexOf(targetElement);

        // Find the last occurrence of the element
        int lastIndex = linkedList.lastIndexOf(targetElement);

        // Display the results
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + targetElement + " is at index: " + firstIndex);
        } else {
            System.out.println(targetElement + " not found in the LinkedList.");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + targetElement + " is at index: " + lastIndex);
        } else {
            System.out.println(targetElement + " not found in the LinkedList.");
        }
    }
}

