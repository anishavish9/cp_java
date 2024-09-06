package FileOperation;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	 public static void main(String[] args) {
        try {
        	FileInputStream fi = new FileInputStream("D://files//names.txt");
	        int i = 0;
	        while((i = fi.read()) != -1) {
	            System.out.print((char) i);
	        }
	        fi.close();
		} catch (IOException e) {
			System.out.println(e);;
		}
    }
}
