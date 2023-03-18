package URL_Class;
import java.net.*;



public class URL_Program {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("https://wwww.google.com/explore");

            String protocol = url.getProtocol(); //Protocol eg, https.
            String host = url.getHost(); //Domian Name Fetch.
            int Port = url.getPort();  // Which port is used.
           


            System.out.println("The protocol is "+ protocol);
            System.out.println("The Host is "+ host);
            System.out.println("The Port is "+ Port );

            System.out.println("File Name :" + url.getFile());
            //File Name Fetch garxa ,for eg:www.google.com/index.html -> which is /explore
            //File name = index.html
            System.out.println("Content :" + url.getContent());
            //Content of website will be Fetched.
          
            

        }
        catch (Exception e)
        {
           System.out.println("Error" + e);
        }
    }

    
}
