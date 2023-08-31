package com.demo;

/*Given numbers: n1 = 4, n2 = 3, n3 = 5

1. Compare n1 with n2 and n3:
   (4 >= 3) is true and (4 >= 5) is false.
   The first condition is true, so print: "4 is the largest number."

Final output: 4 is the largest number.
*/

public class LargeNo {
	public static void main(String[] args) {

	       int n1 = 4, n2 = 3, n3 = 5;

	        if( n1 >= n2 && n1 >= n3) {
	            System.out.println(n1 + " is the largest number.");
	        }

	        else if (n2 >= n1 && n2 >= n3) {
	            System.out.println(n2 + " is the largest number.");
	        }
	        else {
	            System.out.println(n3 + " is the largest number.");
	    }
	}

}
