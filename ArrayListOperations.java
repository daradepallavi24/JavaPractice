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

        // Remove strings with length less than or equal to 3
        stringList.removeIf(str -> str.length() <= 3);

        // Print the modified ArrayList
        System.out.println("\nModified ArrayList:");
        stringList.forEach(System.out::println);
    }
}
