package claim;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class CustomerDao
 */
public class CustomerDao extends HttpServlet {
	
	public int registerCustomer(Customer customer) throws ClassNotFoundException {
		String INSERT_USERS_SQL = 
			"INSERT INTO claim (id, firstname, lastname, username, password, policyname, contact) VALUES (?, ?, ?, ?, ?, ?, ?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "root");
			System.out.println("connected");
			
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);

			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getFirstName());
			preparedStatement.setString(3,  customer.getLastName());
			preparedStatement.setString(4, customer.getUsername());
			preparedStatement.setString(5,  customer.getPassword());
			preparedStatement.setString(6,  customer.getPolicyname());
			preparedStatement.setString(7,  customer.getContact());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			printSQLException(e);
		}
		return result;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e: ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
