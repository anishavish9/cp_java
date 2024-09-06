/*
 * Task 3: PreparedStatement
	Modify the SELECT query program to use PreparedStatement to parameterize the 
	query and prevent SQL injection.
 */

package Day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3_PreparedStatement {
	public static void main(String[] args) {
		try {
			//connectivity to mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","rps@123");
			System.out.println("Connected to database.");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student id to view details -->");
			int id = scan.nextInt();
	
			String insertQuery = "select studentId, studentName, studentPassword from student where studentId=?";
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			if(res != null) {
				System.out.println("Success ");
			}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
		
}
