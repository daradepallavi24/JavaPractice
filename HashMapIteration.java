package com.collectiondemo;

/*The code is part of a package named "com.collectiondemo," which indicates the package structure.
 * It imports the necessary Java classes HashMap and Map from the java.util package.
 * In the main method:a. A HashMap named hashMap is created to store key-value pairs. In this case, the keys are of type Integer, and the values are of type String.
 * b. Several key-value pairs are added to the hashMap using the put method.
 * c. The code iterates through all elements in the hashMap using a for-each loop. 
 * It uses hashMap.entrySet() to obtain a set of key-value pairs (entries), and for each entry, it retrieves the key and value using entry.getKey() and entry.getValue(), respectively.
 * d. Inside the loop, it prints the key and value of each entry using System.out.println.*/

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        // Create a HashMap with key-value pairs
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Date");

        // Iterate through all elements in the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

