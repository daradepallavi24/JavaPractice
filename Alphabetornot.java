package com.demo;

/*Given character: 'a'

1. Initialize c = 'a'

2. Check the condition:
   (c >= 'a' && c <= 'z') is true, so proceed to the if-block.

3. Print: "a is an alphabet."

Final output: a is an alphabet.
*/

public class Alphabetornot {
	 public static void main(String[] args) {

	        char c = 'a';

	        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	            System.out.println(c + " is an alphabet.");
	        else
	            System.out.println(c + " is not an alphabet.");
	    }
	}
