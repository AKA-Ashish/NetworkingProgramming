package ConnectionServerclient;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Serverside {

    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in);

            ServerSocket server_socket = new ServerSocket(1234);
            
            Socket client;
            System.out.println("Waiting for client to connect");
            client = server_socket.accept();
            DataInputStream data_input_stream = new DataInputStream(client.getInputStream());

            String input = data_input_stream.readUTF();

            System.out.println("Message form client "+ input);

            String output = scanner.nextLine();

            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF(output);





        } catch (Exception e) {
            System.out.println();
        }
    }

    
    
}
