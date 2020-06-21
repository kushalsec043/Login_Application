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
%>

<a href="option.jsp">Back to home page..</a><br/><br/> 
Scroll Down to view more!!!!!!!

<br/><br/> 
<img src="https://wallpaperaccess.com/full/1660644.jpg" alt="Italian Trulli"><br/><br/> 
<img src="https://www.technocrazed.com/wp-content/uploads/2015/12/beautiful-wallpaper-download-14.jpg" alt="Italian Trulli"><br/><br/> 
<img src="https://cdn.guidingtech.com/imager/assets/190747/Beautiful-HD-Birds-Wallpapers-Download_4d470f76dc99e18ad75087b1b8410ea9.jpg?1524142273" alt="Italian Trulli"><br/><br/> 
<img src="https://i.ytimg.com/vi/L2WgJgAULo8/maxresdefault.jpg" alt="Italian Trulli"><br/><br/> 
<img src="https://lh3.googleusercontent.com/proxy/r3NPwpnhJYYmxMpkD1Emdi9DiwFS3b-CnOkJ1Za-KqWxKZbvJ0TvcH21XPbsZ9b-NSpBdt1nsCEqMo1_UlblL0iTas1RPC5GbYH8gvBbrFtdS_JkEzDrnvsGzuhI8KQDRrkpR8kwCwdOZa77" alt="Italian Trulli"><br/><br/> 

</body>
</html>