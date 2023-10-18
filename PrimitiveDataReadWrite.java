import java.io.*;
/* 
*The code begins, and the filePath is set to "primitiveData.txt."
*It enters the try block and starts writing data to the file.
*DataOutputStream is created to write data to the file.
*It writes the integer 42, the double 3.14, and the boolean true to the file.
*The DataOutputStream is closed.
*Next, the code begins reading data from the same file.
*DataInputStream is created to read data from the file.
*The DataInputStream is closed.
*The code then prints the data it read from the file:
"Read int data: 42"
"Read double data: 3.14"
"Read boolean data: true"
The program ends.*/

public class PrimitiveDataReadWrite {
    public static void main(String[] args) {
        String filePath = "primitiveData.txt";

        try {
            // Writing to the file
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath));
            dataOutputStream.writeInt(42);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.close();

            // Reading from the file
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));
            int intData = dataInputStream.readInt();
            double doubleData = dataInputStream.readDouble();
            boolean booleanData = dataInputStream.readBoolean();
            dataInputStream.close();

            // Printing the read data
            System.out.println("Read int data: " + intData);
            System.out.println("Read double data: " + doubleData);
            System.out.println("Read boolean data: " + booleanData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
