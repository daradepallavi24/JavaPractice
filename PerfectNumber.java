package com.demo;

/*The program starts, and a Scanner object is created to take input from the user.
 * It prompts the user to enter a number: "Enter a number: ".
 * We input 28 and press Enter.
 * The program reads this input and stores it in the num variable.
 * The scanner.close() statement is called to close the Scanner object.
 * Now, the program checks if 28 is a perfect number by calling the isPerfectNumber method with num as the argument.
 
 * The isPerfectNumber method:
 * Checks if num is less than or equal to 1, and since 28 is greater than 1, it continues.
 * Initializes a sum variable to 1. This is because every number is divisible by 1, and we include it as a divisor.
 * It enters a for loop with i starting from 2.
 * Inside the loop, it checks if i * i <= num, which means that it checks divisors up to the square root of num.
 * If num is divisible by i, it adds i to the sum.
 * If i is not equal to num / i, it means there's another divisor, and it adds num / i to the sum.
 * The loop continues until i reaches the square root of num (i * i greater than 28), and in this case, i is 5.
 * After the loop, it checks if the sum is equal to num.
 * In this case, the sum of divisors of 28 is 1 + 2 + 4 + 7 + 14, which equals 28. So, the sum is indeed equal to num.*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; 

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}

