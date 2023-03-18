package FileHandling;

import java.io.FileReader;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        
        try{
            FileReader fr = new FileReader("Newpage.txt");
            // Newpage.txt char value read
            BufferedReader br = new BufferedReader(fr); // char value to string
            String a = br.readLine();
            // bufferreader le read gareko String lai 'A' variable ma store gareko
            System.out.println(a);



        }
        catch (Exception e)
        {
            System.out.println("Error : " + e);
        }
    }
    
}
