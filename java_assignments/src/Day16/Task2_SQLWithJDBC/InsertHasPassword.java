package Day16.Task2_SQLWithJDBC;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertHasPassword {
	
	//insert data as hashcode
	public static String hashPassword(String p) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(p.getBytes());
        StringBuffer hexa = new StringBuffer();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexa.append('0');
            hexa.append(hex);
        }
        return hexa.toString();
    }

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "rps@123");
            System.out.println("Connection to the database");

            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter id");
            int id = Integer.parseInt(scan.nextLine());
            
            System.out.println("Enter password");
            String password = scan.nextLine();
            
            String hashedPassword = hashPassword(password);
            System.out.println("Hashed Password: " + hashedPassword);
            
            String insertQuery = "insert into User(user_id, password, password_hash) values(?, ?, ?)";
            
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setInt(1, id);
            pstmt.setString(2, password);
            pstmt.setString(3, hashedPassword);
            
            int x = pstmt.executeUpdate();
            if (x > 0) {
                System.out.println("Inserted Successfully");
            } 
            else {
                System.out.println("Could not insert");
            }
        } 
        catch (ClassNotFoundException|SQLException|NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
