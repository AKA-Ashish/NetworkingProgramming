package FileHandling;
import java.io.*;

// import java.io.FileWriter;

public class WriteIntoFile {

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Newpage.txt");
            // Opening Newpage.txt file.
            fw.write("Changes in File handling");
            // Writing text in Newpage.text file.
            fw.close(); // Saving and closing the teext inside Newpage.txt.

            System.out.println("File written text Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Error :" + e);
        }
    }
    
}
