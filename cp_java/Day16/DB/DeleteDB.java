package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDB {
	public static void main(String[] args) {
		try {
			//connectivity to mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","rps@123");
			System.out.println("Connection made to database.");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student id to delete -->");
			System.out.println("Id :");
			int id = scan.nextInt();
//			System.out.println("Name :");
//			String name = scan.next();
//			System.out.println("Password :");
//			String password  = scan.next();
//			
//			String query = "insert into student(studentId,studentName,studentPassword) values(?,?,?)";
			String deleteQuery = "delete from student where studentId=?";
			
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
//			pstmt.setString(1, password);
			pstmt.setInt(1, id);
			int x = pstmt.executeUpdate();
			if(x>0) {
				System.out.println("Deleted data successfully.");
			}
			else {
				System.out.println("Could not able to delete");
			}
			con.close();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
