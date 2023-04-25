package ConnectionServerclient;

import java.net.*;
import java.util.Scanner;
import java.io.*;


public class ClientSide {

    public static void main(String[] args) {


        System.out.println("Client Started !");
        Scanner scanner = new Scanner(System.in);

        
        try {
            Socket client = new Socket("127.0.0.1" , 1234);
            while(true){

                System.out.println("Enter Text :");
                String output = scanner.nextLine();

                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);

                DataInputStream dis = new DataInputStream(client.getInputStream());
                String input = dis.readUTF();
                System.out.println("Message from serve :" + input);

            }


            

                } 
                catch (Exception e) {
            System.out.println("Error in Client :"+ e.getMessage());
        }
    }
    
}
