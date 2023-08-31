package com.demo;

/*Take input 'n'. Let's assume n = 5.

1st iteration (i = 1):
firstTerm = 0, secondTerm = 1
Print: 0
nextTerm = 0 + 1 = 1
firstTerm = 1
secondTerm = 1

2nd iteration (i = 2):
firstTerm = 1, secondTerm = 1
Print: 1
nextTerm = 1 + 1 = 2
firstTerm = 1
secondTerm = 2

3rd iteration (i = 3):
firstTerm = 1, secondTerm = 2
Print: 1
nextTerm = 1 + 2 = 3
firstTerm = 2
secondTerm = 3

4th iteration (i = 4):
firstTerm = 2, secondTerm = 3
Print: 2
nextTerm = 2 + 3 = 5
firstTerm = 3
secondTerm = 5

5th iteration (i = 5):
firstTerm = 3, secondTerm = 5
Print: 3
nextTerm = 3 + 5 = 8
firstTerm = 5
secondTerm = 8

Loop ends as i = 5 which is not less than n (5).
*/

public class Fibonacii {
		  public static void main(String[] args) {

		    int n = 10, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + " ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		      }
		    }
		  }