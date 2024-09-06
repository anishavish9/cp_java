package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpEx {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.geeksforgeeks.org/thread-pools-java/");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		//con.setRequestMethod("Get");
		//connection made then 200 as success code
		System.out.println(con.getResponseCode());
		BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
		//header and body of the html
		String line = bf.readLine();
		System.out.println(line);
	}

}
