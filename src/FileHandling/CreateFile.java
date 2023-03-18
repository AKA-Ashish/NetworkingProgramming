package FileHandling;
import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("Newpage.txt");
        //Import gareko File class ko object banako.

    
        try{
            file.createNewFile();
            //file obj ko through "New-page" file create gareko
            System.out.println("page created Successfully");

        }
        catch (Exception e)
        {
            System.out.println("Error" + e);
        }
    }

    
}
