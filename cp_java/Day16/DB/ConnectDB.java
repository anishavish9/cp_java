package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectDB {

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
			System.out.println("Name :");
			String name = scan.next();
			System.out.println("Password :");
			String password  = scan.next();
			
			String insertQuery = "insert into student(studentId,studentName,studentPassword) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, password);
			int x = pstmt.executeUpdate();
			if(x>0) {
				System.out.println("Update data successfully.");
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
