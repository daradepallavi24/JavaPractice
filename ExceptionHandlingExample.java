package  com.lab;

/*Create the ExceptionHandlingExample class.
 * In the main method, the code enters a try block.
 * Inside the try block, there are three variables defined:numerator is set to 10.
 * denominator is set to 0, which will lead to a division by zero error.
 * result is defined, and the line int result = numerator / denominator; attempts to divide 10 by 0. 
 * This operation will throw an ArithmeticException due to division by zero.
 * The catch block is used to catch the ArithmeticException that occurred in the try block.
 * Inside the catch block, the code prints "An exception occurred: 
 * "along with the error message of the exception (e.getMessage()), which will indicate the nature of the exception.
 * Now, let's dry run the code:The code starts execution and enters the try block.
 * Inside the try block, the program attempts to divide 10 by 0 (numerator / denominator). 
 * This operation results in a division by zero error, which throws an ArithmeticException.
 * The program then immediately jumps to the catch block because it has caught the exception.
 * Inside the catch block, the code prints "An exception occurred: " followed by the error message from the exception, which is " / by zero" in this case.
 * Finally, the program continues to execute any code that follows the catch block (in this case, there is none, so it simply terminates).*/

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Simulate a division by zero exception
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
