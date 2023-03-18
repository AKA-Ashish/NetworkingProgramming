package URL_Class;

import java.net.*;

import java.io.*;



public class GetDatafromURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.facebook.com");
            URLConnection uc = url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            //url ko content lai read garxa ani getInputStream ko through br mha store hunxa

            String a;
            while((a = br.readLine()) != null)
            System.out.println(a + "\n");


        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        

}
}