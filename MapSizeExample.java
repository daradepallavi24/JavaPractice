package com.collectiondemo;

/*The code is part of a package named "com.collectiondemo," which indicates the package structure.
 * It imports the necessary Java classes HashMap and Map from the java.util package.
 * In the main method:a. A HashMap named map is created to store key-value pairs. 
 * In this case, the keys are of type String, and the values are of type Integer.
 * b. Several key-value pairs are added to the map using the put method.
 * c. The code retrieves the number of key-value mappings in the map using the size() method. 
 * The size method returns the number of key-value pairs present in the map.
 * d. The program prints the number of key-value mappings in the map using System.out.println.
*/

import java.util.HashMap;
import java.util.Map;

public class MapSizeExample {
    public static void main(String[] args) {
        // Create a HashMap with key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);
        map.put("David", 28);

        // Get and print the number of key-value mappings in the map
        int size = map.size();
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
