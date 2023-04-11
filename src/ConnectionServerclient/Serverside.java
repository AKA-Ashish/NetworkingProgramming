package ConnectionServerclient;

import java.net.*;
import java.io.*;

public class Serverside {

    public static void main(String[] args) {
        
        try {
            ServerSocket server = new ServerSocket(1234);
            Socket client;
            System.out.println("Waiting for client to connect");
            client = server.accept();
            System.out.println("Connect success");

            while(true){
                DataInputStream dis = new DataInputStream(client.getInputStream());
                String input = dis.readUTF();
                String output = "hello ";
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);


            }
            





        } catch (Exception e) {
            System.out.println();
        }
    }

    
    
}
