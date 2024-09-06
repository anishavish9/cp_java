package Day18;

import java.sql.Connection;
import java.sql.DriverManager;


public class Task1_Singleton {
	
	private static Connection con;
	private static Task1_Singleton obj;
	
	private Task1_Singleton() { //private constructore
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","rps@123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Task1_Singleton getInstance() {
		if(obj == null) {
			obj = new Task1_Singleton();
		}
		return obj;
	}
	
	public static Connection getConnection() {
			return con;
	}
	
	public static void main(String[] args) {
		
		Task1_Singleton instance = Task1_Singleton.getInstance();
		System.out.println("Singleton intance "+ instance);
		Connection con = Task1_Singleton.getConnection();
		if(con !=  null) {
			System.out.println("Connection Made");
		}
		else {
			System.out.println("Failed to connect to data base.");
		}
		//print same as instance only one instance is created
		Task1_Singleton instance1 = Task1_Singleton.getInstance();
		System.out.println("Singleton intance "+ instance1);
	
	}

}
