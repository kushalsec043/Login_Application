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

<a href="option.jsp">Back to home page..</a><br/><br/> 

Scroll down for more!!!!!!!!
<br/><br/> 
<iframe width="560" height="315" src="https://www.youtube.com/embed/LL91B1ldH4E" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>
<br/><br/> 
<iframe width="560" height="315" src="https://www.youtube.com/embed/AXOq9eAWC0k" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>
<br/><br/> 
<iframe width="560" height="315" src="https://www.youtube.com/embed/h6qoje68inc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>
<br/><br/> 
<iframe width="560" height="315" src="https://www.youtube.com/embed/Y4biA3bmX7k" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>
</body>
</html>