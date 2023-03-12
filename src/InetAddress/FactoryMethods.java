package InetAddress;
import java.net.*;


public class FactoryMethods{

	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress address = InetAddress.getLocalHost();  // Local name and Ip
		System.out.println(address);

		InetAddress address2 = InetAddress.getByName("www.youtube.com"); // Domain name and Ip
		System.out.println(address2);

		InetAddress[] address3 = InetAddress.getAllByName("www.google.com");  // 
		System.out.println(address3);

		for (int i = 0; i < address3.length; i++) {
			System.out.println(address3[i]);

		}
		//

		byte[] x={127,0,0,0};

		InetAddress address4 = InetAddress.getByAddress(x);
		System.out.println(address4);
		//


		InetAddress address5 = InetAddress.getByAddress("www.google.com",x);
		System.out.println(address5);




	}
}