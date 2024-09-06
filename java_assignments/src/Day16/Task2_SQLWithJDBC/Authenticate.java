package Day16.Task2_SQLWithJDBC;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Authenticate {
	public static void main(String args[]) {
	    try {
	        Connection con= null;
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root","rps@123");
	        System.out.println("Connected");
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter id");
	        int id = Integer.parseInt(scan.nextLine());
	        
	        System.out.println("Enter password");
	        String password = scan.nextLine();
	        
	        //calling hasPassword() from InsertHasPassword class
	        String hashedInputPassword = InsertHasPassword.hashPassword(password);
	        System.out.println("Hashed Password "+hashedInputPassword);
	        
	        // get the database stored hashed password for this user id
	        String query1 = "select password_hash from User where user_id = ?";
	        
	        PreparedStatement pstmt1 = con.prepareStatement(query1);
	        pstmt1.setInt(1, id);

	        ResultSet res = pstmt1.executeQuery();
	        if (res.next()) {
	            String dbhashPassword = res.getString("password_hash");
	            if (hashedInputPassword.equals(dbhashPassword)) {
	                System.out.println("Valid User access is allowed");
	            } 
	            else {
	                System.out.println("Invalid User Does Not Matched");
	            }
	        }
	    } 
	    catch (ClassNotFoundException | SQLException | NoSuchAlgorithmException  e) {
	        e.printStackTrace();
	    }
	} 

}
