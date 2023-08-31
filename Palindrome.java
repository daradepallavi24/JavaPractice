package com.demo;

/*Given number: 121

1. Initialize r = 0, sum = 0, temp = 0, n = 121

2. temp = n = 121

3. Enter the `while` loop:
   a. r = 121 % 10 = 1, sum = (0 * 10) + 1 = 1, n = 121 / 10 = 12
   b. r = 12 % 10 = 2, sum = (1 * 10) + 2 = 12, n = 12 / 10 = 1
   c. r = 1 % 10 = 1, sum = (12 * 10) + 1 = 121, n = 1 / 10 = 0

4. Condition (temp == sum) is true, so print: "palindrome number"

Final output: palindrome number
*/

public class Palindrome { 
		 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=121; 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  