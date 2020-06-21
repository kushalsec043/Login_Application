<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/>
Back to Login !!!<br>
<a href="Login.jsp">Click Login</a>
<br/><br/>
   Please register by providing details below..........<br/><br/>
<form action="Register" method="post">  
  
	 Name    :<input type="text" name="username" required/><br/><br/>  
	Password :<input type="password" name="userpass" required/><br/><br/>  
	 Email   :<input type="text" name="usermail" required/><br/><br/>  
	Country  :  
			<select name="userCountry" required>  
			<option>India</option>  
			<option>Pakistan</option>  
			<option>other</option>  
			</select>
	<br/><br/>  

	<input type="submit" value="register"/>  
</form>  
</body>
</html>

