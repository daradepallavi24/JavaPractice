package packagecom.stremdemo;

/*The program starts with the import statements and defines the ConsoleInputToFile class.
 * Inside the main method:
 * A Scanner object (scanner) is created to read input from the console.
 * The program prompts the user to enter text to write to a file using System.out.print("Enter text to write to the file: ").
 * The user's input is read from the console using scanner.nextLine() and stored in the userInput variable.
 * The program prompts the user to enter the file name (e.g., output.txt) where the input should be written using System.out.print("Enter the file name (e.g., output.txt): ").
 * The user's input for the file name is read using scanner.nextLine() and stored in the fileName variable.
 * The program enters a try-catch block to handle potential IOException that might occur during file writing.
 * Inside the try block:
 * A FileWriter (fileWriter) is created to write to the file specified by fileName.
 * A BufferedWriter (bufferedWriter) is created to efficiently write text to the FileWriter.
 * The user's input (userInput) is written to the file using bufferedWriter.write(userInput).
 * The BufferedWriter is closed using bufferedWriter.close() to save the changes to the file.
 * A message is displayed on the console indicating that the input has been written to the file successfully.
 * If an IOException occurs, it is caught in the catch block, and the exception is printed using e.printStackTrace().
 * In the finally block, the Scanner (scanner) is closed to release system resources.*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text to write to the file: ");
        String userInput = scanner.nextLine();
        
        System.out.print("Enter the file name (e.g., output.txt): ");
        String fileName = scanner.nextLine();
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(userInput);
            
            bufferedWriter.close();
            System.out.println("Input has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

