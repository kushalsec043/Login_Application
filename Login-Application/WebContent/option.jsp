<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

if(session.getAttribute("username") == null)
{
	response.sendRedirect("Welcome.jsp");
}
%>

WELCOME!!! Home Page<br/><br/> 
<a href="Videos.jsp">To View Videos.</a><br/><br/>  
<a href="Images.jsp">To View Images.</a><br/><br/>   

<a href="Myaccountinfo.jsp">My account Info</a><br/><br/> 

<a href="Logout">Sign Out...</a><br/><br/> 
</body>
</html>