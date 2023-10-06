package packagecom.stremdemo;

/*The program starts with the import statements and defines the FileCopy class.
 * Inside the main method:
 * The inputFile variable is set to "input.txt" and the outputFile variable is set to "output.txt". You should replace these with the actual paths to your input and output files.
A try-catch block is used to handle potential IOException that might occur during file reading and writing.

Inside the try block:

A FileReader (fileReader) is created to read the content from the input file specified by inputFile.
A BufferedReader (bufferedReader) is created to efficiently read text from the FileReader.
A FileWriter (fileWriter) is created to write content to the output file specified by outputFile.
A BufferedWriter (bufferedWriter) is created to efficiently write text to the FileWriter.
The program enters a while loop, which continues as long as readLine() from the BufferedReader returns a non-null value. In each iteration:

A line from the input file is read using bufferedReader.readLine() and stored in the line variable.
The content of line is written to the output file using bufferedWriter.write(line).
A newline character is added to separate lines using bufferedWriter.newLine().
After the loop, both the BufferedReader and BufferedWriter are closed using close() to save the changes and release system resources.

If an IOException occurs, it is caught in the catch block, and the exception is printed using e.printStackTrace().

Finally, a message is displayed on the console indicating that the file has been copied successfully.*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFile = "input.txt"; // Replace with the path to your input file
        String outputFile = "output.txt"; // Replace with the path to your output file

        try {
            // Create a FileReader and BufferedReader to read from the input file
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create a FileWriter and BufferedWriter to write to the output file
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read and write each line from the input file to the output file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline character to separate lines
            }

            // Close the input and output streams
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

