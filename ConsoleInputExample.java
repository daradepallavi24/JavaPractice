package packagecom.stremdemo;

/*The program starts with the definition of a package named "packagecom.stremdemo" (the package name may be a typo as "stremdemo" seems like a misspelling of "streamdemo").
 * It then imports the Scanner class from the java.util package.
 * The program defines a class named "ConsoleInputExample."
 * Inside the class, the main method is defined as the entry point of the program.
 * Within the main method:
 * It creates a Scanner object named "scanner" to read input from the console.
 * It displays the text "Enter something: " in the console using System.out.print().
 * It reads a line of input from the console and stores it in the "userInput" variable using scanner.nextLine().
 * It closes the Scanner object to release system resources using scanner.close().
 * Finally, it displays the message "You entered: " followed by the user's input using System.out.println().*/

import java.util.Scanner;
public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        scanner.close();
        System.out.println("You entered: " + userInput);
    }
}
