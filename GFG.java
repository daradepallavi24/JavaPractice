package packagecom.stremdemo;

/*You import the necessary classes for file handling and date formatting.
 * You create two instances of the File class, file1 and file2, representing two files. 
 * file1 points to a file named "GFG.java," which exists in the system, and file2 points to a file named "file.txt," which may or may not exist in the system.
 * You use the lastModified() method to get the last modified time of each file. This method returns the time in milliseconds since January 1, 1970, 00:00:00 GMT (the Unix epoch).
 * You create a SimpleDateFormat object sdf to format the date and time in a more readable format. 
 * The pattern "MMMM dd, yyyy hh:mm a" specifies the format as "Month Day, Year Hour:Minute AM/PM."
 * You use the sdf.format(time1) and sdf.format(time2) methods to format the last modified times of file1 and file2, respectively.
 * Finally, you print the formatted last modified times of both files.
 * Please note that if the file specified by file2 does not exist, the lastModified() method will return 0, which corresponds to January 1, 1970, 00:00:00 GMT, and you'll see this as the output for "file.txt modified date." 
 * Ensure that the file path in file2 is correct if you want to get the actual last modified time for an existing file.*/

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class GFG {
    public static void main(String[] args) {
        File file1 = new File("/home/pallavi/GFG.java");
        File file2 = new File("/home/pallavi/file.txt");
        long time1 = file1.lastModified();
        long time2 = file2.lastModified();
        DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("GFG.java modified date is : " + sdf.format(time1));
        System.out.println("file.txt modified date is : " + sdf.format(time2));
    }
}

