package packagecom.stremdemo;

import java.io.*;

public class PrimitiveDataReadWrite {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "primitiveData.txt";

        try {
            // Create a DataOutputStream to write primitive data to the file
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath));

            // Write primitive data to the file
            dataOutputStream.writeInt(42);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeBoolean(true);

            // Close the DataOutputStream
            dataOutputStream.close();

            // Create a DataInputStream to read primitive data from the file
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));

            // Read and display the primitive data from the file
            int intData = dataInputStream.readInt();
            double doubleData = dataInputStream.readDouble();
            boolean booleanData = dataInputStream.readBoolean();

            System.out.println("Read int data: " + intData);
            System.out.println("Read double data: " + doubleData);
            System.out.println("Read boolean data: " + booleanData);

            // Close the DataInputStream
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

