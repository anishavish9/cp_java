package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		while(true) {
			Socket client = serverSocket.accept();
			System.out.println("connected");
			DataInputStream di = new DataInputStream(client.getInputStream());
			String s = di.readUTF();
			System.out.println("Message retrived from client " + s);
			di.close();
			serverSocket.close();
			client.close();
		}

	}

}
