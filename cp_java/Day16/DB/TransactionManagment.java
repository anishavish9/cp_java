package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class TransactionManagment {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner scan = null;
        
        try {
            // Connectivity to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "rps@123");
            System.out.println("Connected to database.");
            
            scan = new Scanner(System.in);
            con.setAutoCommit(false);            
            String insertQuery = "insert into student(studentId, studentName, studentPassword) values(?, ?, ?)";
            pstmt = con.prepareStatement(insertQuery);
            
            while (true) {
                System.out.println("Id :");
                int id = scan.nextInt();
                scan.nextLine(); 
                
                System.out.println("Name :");
                String name = scan.nextLine();
                
                System.out.println("Password :");
                String password = scan.nextLine();
                
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, password);
                pstmt.executeUpdate();
                
                System.out.println("commit or rollback?");
                String commit = scan.nextLine();
                
                if (commit.equals("commit")) {
                    con.commit();
                } 
                else if (commit.equals("rollback")) {
                    con.rollback();
                }
                
                System.out.println("Type Y to continue, any other key to exit:");
                String val = scan.nextLine();
                
                if (!val.equalsIgnoreCase("Y")) {
                    break;
                }
            }
            con.commit();
            System.out.println("Records Saved");
            
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            if(con != null) {
            	try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
            }
        } 
        
    }
}





