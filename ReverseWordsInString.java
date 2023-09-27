package com.string;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseWords(inputString);
        
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" "); // Split the input string into words
        StringBuilder reversedBuilder = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word); // Reverse each word
            reversedBuilder.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversedBuilder.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWordBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWordBuilder.append(word.charAt(i)); // Reverse the word character by character
        }
        return reversedWordBuilder.toString();
    }
}
