package Day15.Task5_NetworkingSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
	 public static void main(String args[]) throws IOException {
	        Socket socket = new Socket("localhost", 9999);
	        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

	        Calculation obj = new Calculation(20, 30, "-");
	        System.out.println("x "+ obj.getX() + " y " + obj.getY() + " Operation " +obj.getOperation());
	        out.writeObject(obj);
	        //out.flush();

	        ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
	        int responseResult = oi.readInt();
	        System.out.println("The Result is " + responseResult);
	        socket.close();
	    }

}
