package com.demo;

/*
 Given number: 5

1st iteration (i = 1):
    fact = 1 * 1 = 1

2nd iteration (i = 2):
    fact = 1 * 2 = 2

3rd iteration (i = 3):
    fact = 2 * 3 = 6

4th iteration (i = 4):
    fact = 6 * 4 = 24

5th iteration (i = 5):
    fact = 24 * 5 = 120

Loop ends as i = 6 which is not less than or equal to number (5).

Final output: Factorial of 5 is: 120
*/

class Factorial{  
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=5;   
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  