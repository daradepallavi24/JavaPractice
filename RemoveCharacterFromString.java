package com.string;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char charToRemove = 'o';

        // Replace all occurrences of charToRemove with an empty string
        String modifiedString = originalString.replace(String.valueOf(charToRemove), "");

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}

