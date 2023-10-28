package  com.lab;

/*Import the necessary package and create the VotingApplication class.
 * In the main method, a Scanner object scanner is created to read user input.
 * The code enters a try block.
 * The program prints the message "Please enter your age: " to prompt the user for their age.
 * The nextInt() method of the scanner object is used to read an integer input from the user, and this value is stored in the int age variable.
 * The code then checks if the user's age is less than 18 using an if statement.
 * If the age is less than 18, an exception is thrown with the message "Sorry, you must be 18 or older to vote."
 * If the age is 18 or older, the program prints "You are eligible to vote."
 * The catch block is used to catch any exceptions that may be thrown. In this case, it catches the exception and prints the error message contained in the exception.
 * The finally block ensures that the scanner object is closed, regardless of whether an exception was thrown or not.
 * Now, run the code with an example:Suppose the user enters an age of 20:
 "Please enter your age: " is displayed.
   The user inputs 20.
   Since 20 is greater than or equal to 18, the program prints "You are eligible to vote."
   Suppose the user enters an age of 16:
 *"Please enter your age: " is displayed.
    The user inputs 16.
    Since 16 is less than 18, the code throws an exception with the message "Sorry, you must be 18 or older to vote."
* The code handles this exception by catching it in the catch block and printing the error message.
* In both cases, the finally block is executed, closing the scanner object to release system resources.*/

import java.util.Scanner;

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new Exception("Sorry, you must be 18 or older to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}



