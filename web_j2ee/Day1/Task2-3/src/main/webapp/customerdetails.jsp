<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="claim.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- using javabeans  -->
<jsp:useBean id="customer" class="claim.Customer" />
 
<jsp:setProperty property="*" name="customer" />
 
<%
 CustomerDao customerDao = new CustomerDao();
 int status = customerDao.registerCustomer(customer);
 if (status > 0) {
	out.print("You are successfully Claimed the Policy");
 }
 else {
	out.println("Sorry claim rejected");
 }
                
%>
</body>
</html>
