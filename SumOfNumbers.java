package com.demo;

/*User input: n

1. Initialize `scanner` to accept user input.

2. Print: "Enter a number: "

3. User enters: n
   `number` is set to n.

4. Initialize `sum` to 0.

5. `for` loop starts:
   a. i = 1, sum = 0 + 1 = 1
   b. i = 2, sum = 1 + 2 = 3
   c. i = 3, sum = 3 + 3 = 6
   d. i = 4, sum = 6 + 4 = 10
   e. i = 5, sum = 10 + 5 = 15
   e. i = n, sum = 10 + n = n
   Loop ends as i = 6, which is not less than or equal to `number` (5).

6. Print: "Sum of numbers from 1 to n is: n"

7. Close the `scanner`.

Final output: Sum of numbers from 1 to n is: n
*/

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
        
        scanner.close();
    }
}

