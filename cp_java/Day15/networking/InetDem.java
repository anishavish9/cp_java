package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDem {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress add = InetAddress.getLocalHost();
		System.out.println(add);
		add = InetAddress.getByName("www.simplilearn.com");
		System.out.println(add);
		InetAddress ad[] = InetAddress.getAllByName("www.tutorialspoint.com");
		for(int i=0; i< ad.length; i++) {
			System.out.println(ad[i]);
		}

	}

}
