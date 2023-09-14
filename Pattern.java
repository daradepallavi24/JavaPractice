package com.demo;

/*n is initialized to 4.
 * The outer loop (for (int i = 1; i <= n; i++)) runs from i = 1 to i = 4 because n is 4.
 * a. When i is 1:
 The first inner loop (for (int j = 1; j <= i; j++)) runs once, printing '1' without a newline.
 The second inner loop (for (int j = i - 1; j >= 1; j--)) does not run because i - 1 is 0.
 A newline is printed, and we move to the next row.
 So, the first row is "1".

*  b. When i is 2:
 The first inner loop runs twice, printing '12' without a newline.
 The second inner loop does not run because i - 1 is 1.
 A newline is printed, and we move to the next row.
 So, the second row is "12".

*  c. When i is 3:
 The first inner loop runs three times, printing '123' without a newline.
 The second inner loop runs once, printing '21' without a newline.
 A newline is printed, and we move to the next row.
 So, the third row is "12321".

*  d. When i is 4:
 The first inner loop runs four times, printing '1234' without a newline.
 The second inner loop runs three times, printing '432' without a newline.
 A newline is printed, and we move to the next row.
 So, the fourth row is "1234432"
*/

public class Pattern {
    public static void main(String[] args) {
        int n = 4; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); 
        }
    }
}

