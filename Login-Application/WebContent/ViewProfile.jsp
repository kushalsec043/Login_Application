<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/> 
<br/><br/> 
<%

response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

if(session.getAttribute("username") == null)
{
	response.sendRedirect("Welcome.jsp");
}

out.println("Your Username: " + session.getAttribute("username") + "    |     ");
out.println("Password: " + session.getAttribute("pass"));
%>
<br/><br/>
<br/><br/> 
.........Options.........<br>
<br/><br/> 
<a href="Update.jsp">Go Back</a><br>
<br/><br/> 
<a href="Welcome.jsp">Exit Application</a><br>

</body>
</html>