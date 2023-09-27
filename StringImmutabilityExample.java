package com.string;

public class StringImmutabilityExample {
    public static void main(String[] args) {
        String originalString = "Hello, ";
        System.out.println("Original String: " + originalString);

        // Concatenation operation
        String newString = originalString + "World!";
        System.out.println("Concatenated String: " + newString);

        // Uppercase operation
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Substring operation
        String subString = originalString.substring(0, 5);
        System.out.println("Substring: " + subString);

        // Replace operation
        String replacedString = originalString.replace("Hello", "Hi");
        System.out.println("Replaced String: " + replacedString);

        // Original string remains unchanged
        System.out.println("Original String (after operations): " + originalString);
    }
}

