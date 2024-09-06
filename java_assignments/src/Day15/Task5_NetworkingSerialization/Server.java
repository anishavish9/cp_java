package Day15.Task5_NetworkingSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	 public static void main(String args[]) throws IOException, ClassNotFoundException {
	        ServerSocket serverSocket = new ServerSocket(9999);

	        while(true) {
	            Socket client = serverSocket.accept();
	            System.out.println("Connected");
	            ObjectInputStream oi = new ObjectInputStream(client.getInputStream());

	            Calculation ob = (Calculation) oi.readObject();
	            int result;
	            int a = ob.getX();
	            int b = ob.getY();
	            String operation = ob.getOperation();

	            switch(operation) {
	                case "+":
	                    result = a + b;
	                    break;
	                case "-":
	                    result = a - b;
	                    break;
	                case "*":
	                    result = a * b;
	                    break;
	                case "/":
	                    result = a / b;
	                    break;
	                default:
	                    result = -1;
	            }

	            ObjectOutputStream oo = new ObjectOutputStream(client.getOutputStream());
	            oo.writeInt(result);
	            oo.flush();
	            client.close();
	        }
	    }

}
