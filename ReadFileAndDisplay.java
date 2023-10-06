package packagecom.stremdemo;

/*The program starts with the import statements and defines the ReadFileAndDisplay class.
 * Inside the main method:
 * The filePath variable is set to "path/to/your/external/file.txt". 
 * You should replace this with the actual path to the external file you want to read.
 * A try-catch block is used to handle potential IOException that might occur during file reading.
 * Inside the try block:
 * A FileReader (fileReader) is created to read the file specified by filePath.
 * A BufferedReader (bufferedReader) is created to efficiently read text from the FileReader.
 * The program enters a while loop, which continues as long as readLine() from the BufferedReader returns a non-null value. 
 * In each iteration:
 * A line from the file is read using bufferedReader.readLine() and stored in the line variable
 * The content of line is displayed on the console using System.out.println(line).
 * After the loop, both the BufferedReader and FileReader are closed in the finally block to release system resources.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndDisplay {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "path/to/your/external/file.txt";

        try {
            // Create a FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read and display each line from the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
