package networking;

import java.io.IOException;
import java.net.URL;

public class UrlEx {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.geeksforgeeks.org/thread-pools-java/");
		String protocol = url.getProtocol();
		System.out.println("protocol : "+protocol);
		int port = url.getPort();
		System.out.println("Port : "+port);
		String file = url.getFile();
		System.out.println("File : "+file);
		System.out.println(url.getHost());
		
	}

}
