

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Claim
 */
public class Claim extends HttpServlet {   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int claimnumber = Integer.parseInt(request.getParameter("claimnumber"));
        String description = request.getParameter("description");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();             
        if(claimnumber!=0) {
	       out.println("<html>");
	       out.println("<head> <title>Insurance Claim Submitted</title></head>");
	       out.println("<body>");
	       out.println("<h1> Claim Submitted Successfully</h1>");
	       out.println("<p> Claim Number :"+claimnumber+"</p>");              
	       out.println("<p> Description :"+description+"</p>");
	       out.println("</body>");
	       out.println("</html");
	    }
	    else {
	         out.println("Sorry Claim Rejected");
	    }
	}

}
