/*
 * Task 1: Establishing Database Connections
	Write a Java program that connects to a SQLite database and prints out 
	the connection object to confirm successful connection.
 */

package Day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task1_ConnectDB {
	public static void main(String[] args) {
		try {
			//connectivity to mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","rps@123");
			System.out.println("Connected to database.");
		
		} catch ( SQLException | ClassNotFoundException  e) {
			
			e.printStackTrace();
		}
		

	}

}
