package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("D://files//employee.ser");
		//de-serialization
		ObjectInputStream input = new ObjectInputStream(fi);
		Employee emp1 = (Employee)input.readObject();
		
		System.out.println("Employee detail : "+emp1.getId()+ " " + emp1.getName()+ " "+ emp1.getAge());
	}

}
