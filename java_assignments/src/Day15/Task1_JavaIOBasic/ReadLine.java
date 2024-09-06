package Day15.Task1_JavaIOBasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) {
        try {
        	
            BufferedReader br = new BufferedReader(new FileReader("/home/rps/Documents//files//names.txt"));
            String line = br.readLine();
            while (line != null) {
                String[] names = line.split(",");
                for (String name : names) {
                    name = name.trim();
                    System.out.println(name + " " +name.length());                  
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
