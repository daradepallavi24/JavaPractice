package  com.lab;

/*The program starts in the main method and calls the readFile method with a file path.
 * The readFile method checks if the file exists and throws a custom exception if it doesn't.
 * If the file exists, it proceeds to open the file, read its contents, and print them.
 * If any IOException occurs during file reading or while closing the file, it is caught and rethrown in the try block of the readFile method.
 * In the finally block of the readFile method, it ensures that the reader is closed and catches and rethrows any IOException that may occur while closing.
 * In the catch block of the main method, exceptions are handled. If a custom FileNotFoundExceptionException occurs, its message is printed. 
 * If an IOException occurs, a generic error message is printed.*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\kk\\Desktop"); 
        } catch (FileNotFoundExceptionException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundExceptionException, IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundExceptionException("File not found: " + filePath);
        }

        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
    }
}

class FileNotFoundExceptionException extends Exception {
	private static final long serialVersionUID = 1L;

	public FileNotFoundExceptionException(String message) {
        super(message);
    }
}
