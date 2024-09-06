package networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientEx {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9999);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String msg = "Hello all";
			dos.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		//first server run than client 

	}

}
