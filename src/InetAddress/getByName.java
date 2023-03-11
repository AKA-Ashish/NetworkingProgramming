package InetAddress;

import java.net.*;

public class getByName {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.youtube.com");
            System.out.println(" :" + address);
          
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}
    


