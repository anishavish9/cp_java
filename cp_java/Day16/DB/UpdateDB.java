package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDB {
	public static void main(String[] args) {
		try {
			//connectivity to mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","rps@123");
			System.out.println("Connected to database.");
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student id to update -->");
			System.out.println("Id :");
			int id = scan.nextInt();
			System.out.println("Password :");
			String password  = scan.next();
			
			String updateQuery = "update student set studentPassword=? where studentId=?";
			
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			pstmt.setString(1, password);
			pstmt.setInt(2, id);
			int x = pstmt.executeUpdate();
			if(x>0) {
				System.out.println("Updated data successfully.");
			}
			else {
				System.out.println("Could not able to update");
			}
			con.close();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
