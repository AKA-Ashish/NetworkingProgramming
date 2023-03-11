package InetAddress;

import java.net.*;


public class alladdress {

    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("127.0.0.0"); // Name of domain
            System.out.println(" :" + address);
            System.out.println(address.getHostAddress()); // Domian name Ip address

            System.out.println(address.isLinkLocalAddress()); //Link is locally launced or golbally

            System.out.println(address.isLoopbackAddress()); // packet couldn't reach to the addresss

            System.out.println(address.isSiteLocalAddress()); // To check wheather it is locally hosted or not

            System.out.println(address.getAddress()); // return Ip address in the form of array(string)

           System.out.println(address.isMCGlobal()); // check whether the multicast address has global scope or not


           InetAddress[] getallbyName = InetAddress.getAllByName("www.google.com"); ////////////
            System.out.println(getallbyName);

            for (InetAddress i : getallbyName) {
                System.out.println("Get All by Name : " + i);
            }


    
            
            
           
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
    
}
