package com.demo;

/*
 * Initialize i = 2 (starting value of the loop variable)
Loop condition: i <= 100

1st iteration:
    i = 2
    Print: 2

2nd iteration:
    i = 4
    Print: 2 4

3rd iteration:
    i = 6
    Print: 2 4 6

(continuing this process for each even number less than or equal to 100)

Last iteration:
    i = 100
    Print: 2 4 6 ... 98 100

Loop ends as i = 102, which is not less than or equal to 100.

Final output: 2 4 6 ... 98 100
*/

public class EvenNo {
	    public static void main(String[] args) {
	        for (int i = 2; i <= 100; i += 2) {
	            System.out.print(i + " ");
	        }
	    }
}
