package Day16.Task2_SQLWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
	public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "rps@123");
            System.out.println("Connected");

            Statement stmt = con.createStatement();
            String create = 
            	"create table User(user_id INT PRIMARY KEY, password varchar(50),password_hash varchar(200) NOT NULL)";
            stmt.executeUpdate(create);
            System.out.println("Table created");
        } 
        catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }

}
