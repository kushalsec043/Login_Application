<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/> 
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

if(session.getAttribute("username") == null)
{
	response.sendRedirect("Welcome.jsp");
}
%>
.........Options.........<br>
<a href="MyProfile">View My Account Info</a><br><br/><br/> 
<a href="Myaccountinfo.jsp">Go Back</a><br> <br/><br/> 
<a href="Welcome.jsp">Exit Application</a><br>
</body>
</html>