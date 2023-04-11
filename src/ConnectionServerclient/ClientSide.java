package ConnectionServerclient;

import java.net.*;
import java.io.*;


public class ClientSide {

    public static void main(String[] args) {
        
        try {
            Socket client = new Socket("127.0.0.1" , 1234);

            String input;
            String output = "hello server";

            DataInputStream dis = new DataInputStream(client.getInputStream());

            input= dis.readUTF();
            System.out.println("Data from server" + input );
            
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF(output);

                } 
                catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
