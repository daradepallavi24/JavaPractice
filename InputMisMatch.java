package  com.lab;

/*The program begins by creating a Scanner object to read user input.
 * It enters a try block to handle potential exceptions.
 * It prompts the user to enter an integer and attempts to read the input using scanner.nextInt().
 * If the user enters a valid integer, the program displays the input.
 * If the user enters something that is not a valid integer (e.g., a string or a non-integer value), an InputMismatchException is thrown.
 * The program catches the InputMismatchException in the catch block and prints an error message indicating that the input is not a valid integer.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
        	
        	System.out.println("Error: Input is not a valid integer.");
        }
    }

}
