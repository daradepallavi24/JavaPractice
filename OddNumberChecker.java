package  com.lab;

/*Create the OddNumberChecker class.
 * In the main method, the code enters a try block.
 * Inside the try block, an integer variable number is declared and initialized with the value 7.
 * int number = 7;
 * The program then calls the checkIfEven method and passes the number as an argument.
 * checkIfEven(number);
 * The checkIfEven method is called, and it checks if the provided number is even or odd.
 * In this case, number is 7, and since 7 % 2 is not equal to 0, it is considered an odd number.
 * Inside the checkIfEven method, because the number is odd, it throws an exception with a message indicating that the number is odd and even numbers are required.
 * throw new Exception(number + " is an odd number. Even numbers are required.");
 * Back in the main method, the code proceeds to the next line. 
 * However, the line System.out.println(number + " is an even number."); is never reached because an exception has been thrown.
 * The code enters the catch block to catch the exception that was thrown in the checkIfEven method.
 * Inside the catch block, the code prints the error message associated with the exception. 
 * In this case, the error message will be "7 is an odd number. Even numbers are required."
 * Now, let's summarize the flow:
 * The code begins by entering the try block.
 * It initializes number to 7.
 * The checkIfEven method is called with number as an argument.
 * In the checkIfEven method, it is determined that 7 is an odd number, so an exception is thrown.
 * The program immediately jumps to the catch block, where it prints the error message indicating that 7 is an odd number and even numbers are required.
 * The line attempting to print "7 is an even number" in the main method is never executed due to the exception.
 * The output you'll see when running this code is: "7 is an odd number.
 * Even numbers are required," indicating that an Exception was thrown when trying to check an odd number*/

public class OddNumberChecker {
    public static void main(String[] args) {
        try {
            int number = 7; // Replace with the number you want to check
            checkIfEven(number);
            System.out.println(number + " is an even number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkIfEven(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception(number + " is an odd number. Even numbers are required.");
        }
    }
}

