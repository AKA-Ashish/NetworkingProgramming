package FileHandling;
import java.io.*;
public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("Newpage.txt");
        if(file.delete()){
            System.out.println(file.getName()+"=Deleted");
        }else{
            System.out.println(file.getName() + "= Couldn't delete ");

        }
    }

    
}
