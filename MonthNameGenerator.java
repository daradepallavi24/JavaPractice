package com.demo;

/*package com.demo;: This line declares the package name as "com.demo." Java code is typically organized into packages for better organization and to avoid naming conflicts.
 * import java.util.Scanner;: This line imports the Scanner class from the java.util package, which is used for taking input from the user.
 * public class MonthNameGenerator {: This line declares the start of a public class named MonthNameGenerator. This is the main class of your Java program.
 * public static void main(String[] args) {: This line declares the main method, which is the entry point of your Java program. It takes an array of strings (args) as input.
 * Scanner scanner = new Scanner(System.in);: Here, a new Scanner object is created to read input from the console (standard input).
 * System.out.print("Input number: ");: This line prints the message "Input number: " to the console, prompting the user to enter a number.
 * int userInput = scanner.nextInt();: It reads an integer from the user input using the nextInt() method of the Scanner object and stores it in the userInput variable.
 * if (userInput < 1 || userInput > 12) {: This line checks whether the userInput is less than 1 or greater than 12. If it is, it enters the if block.
 * System.out.println("Invalid input. Please enter a number between 1 and 12.");: Inside the if block, it prints an error message to the console, indicating that the input is invalid.} else 
 * {: If the user input is between 1 and 12, the program enters the else block.
 * String monthName = getMonthName(userInput);: It calls the getMonthName method with the userInput as an argument and stores the returned month name in the monthName variable.
 * System.out.println("Month: " + monthName);: It prints the month name obtained from the getMonthName method along with the "Month: " prefix.
 * scanner.close();: Finally, the Scanner object is closed to release system resources.
 * public static String getMonthName(int monthNumber) {: This line declares a public static method named getMonthName that takes an integer monthNumber as an argument.
 * String[] monthNames = { ... };: An array of month names is defined, with the names of all 12 months of the year.
 * return monthNames[monthNumber - 1];: The method returns the month name corresponding to the monthNumber passed as an argument.
 * It subtracts 1 from monthNumber because array indices start from 0, while months are typically numbered from 1 to 12.
 * */

import java.util.Scanner;

public class MonthNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 12) {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        } else {
            String monthName = getMonthName(userInput);
            System.out.println("Month: " + monthName);
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return monthNames[monthNumber - 1];
    }
}
