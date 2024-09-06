package Day15.Task1_JavaIOBasic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream file = new FileOutputStream("/home/rps/Documents//files//names.txt");
			String names = "Milan, Italy, Berlin, Chicago";
			byte arr[] = names.getBytes();

			file.write(arr);
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
