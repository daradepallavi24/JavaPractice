package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
	public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Pallavi");
        stringList.add("Madhukar");
        stringList.add("Darade");
        stringList.add("BE");

        // Iterate through the ArrayList and print each string with its length
        stringList.forEach(str -> System.out.println(str + " Length: " + str.length()));

        ArrayList<String> removedElements = new ArrayList<>();
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() <= 3) {
                removedElements.add(str);
                iterator.remove();
            }
        }
        // Print the removed elements
        System.out.println("\nRemoved Elements:");
        removedElements.forEach(System.out::println);
        
        // Print the modified ArrayList
        System.out.println("\nModified ArrayList:");
        stringList.forEach(System.out::println);
    }
}
