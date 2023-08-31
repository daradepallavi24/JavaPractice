package com.demo;

/*Given values: x = 1, y = 2

1. Print: "Before swapping: x = 1 y = 2"

2. Initialize temp = 1 (value of x).

3. Assign y's value to x: x = 2
   Assign temp's value (1) to y: y = 1

4. Print: "After swapping: x = 2 y = 1"

Final output:
Before swapping: x = 1 y = 2
After swapping: x = 2 y = 1
*/

public class Swap {
	  public static void main(String[] args) {
	    int x = 1;
	    int y = 2;

	    System.out.println("Before swapping: x = " + x + " y = " + y);

	    int temp = x;
	    x = y;
	    y = temp;

	    System.out.println("After swapping: x = " + x + " y = " + y);
	    }
	}
