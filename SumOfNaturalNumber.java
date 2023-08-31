package com.demo;

/*
 * Take input 'n'. Let's assume n = 10.

1st iteration (i = 1):
sum = 0 + 1 = 1

2nd iteration (i = 2):
sum = 1 + 2 = 3

3rd iteration (i = 3):
sum = 3 + 3 = 6

4th iteration (i = 4):
sum = 6 + 4 = 10

5th iteration (i = 5):
sum = 10 + 5 = 15

6th iteration (i = 6):
sum = 15 + 6 = 21

7th iteration (i = 7):
sum = 21 + 7 = 28

8th iteration (i = 8):
sum = 28 + 8 = 36

9th iteration (i = 9):
sum = 36 + 9 = 45

10th iteration (i = 10):
sum = 45 + 10 = 55

Loop ends as i = 10 which is not less than n (10).
*/

public class SumOfNaturalNumber {
	public static void main(String[] args)   
	{  
	int i, num = 10, sum = 0;  
	for(i = 1; i <= num; ++i)  
	{  
	sum = sum + i;  
	}  
	System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
	}  
	}
