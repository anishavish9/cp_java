/*
 *Tasks 4 :Java Networking
 * Write a simple HTTP client that connects to a URL, sends a request, 
 * and displays the response headers and body.
 */

package Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task4_Networking {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.geeksforgeeks.org/differences-between-ipv4-and-ipv6/\n");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		//con.setRequestMethod("Get");
		//connection made then 200 as success code
		System.out.println(con.getResponseCode());
		BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
		//header and body of the html
		String line ;
		while ((line = bf.readLine()) != null) { 
			System.out.println(line);; 
		}
	}
}
