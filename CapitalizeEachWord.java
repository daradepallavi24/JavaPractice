package com.string;

import java.util.Scanner;

public class CapitalizeEachWord {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String inputString = scanner.nextLine();

	        String[] words = inputString.split("\\s+");
	        
	        String result = "";

	        for (String word : words) {
	            String capitalizedWord = word.toUpperCase();
	            result += capitalizedWord + " ";
	        }

	        String capitalizedString = result.trim();

	        System.out.println("Capitalized sentence: " + capitalizedString);
	    }
}