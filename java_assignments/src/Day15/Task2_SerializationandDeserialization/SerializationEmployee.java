package Day15.Task2_SerializationandDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Raju", 23);
		try {
			FileOutputStream fo = new FileOutputStream("D://files//employee.ser");
			//serialization of object
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(emp1);
			System.out.println("Employee is serielized");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
