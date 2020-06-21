import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Register")
public class Register extends HttpServlet
{
	
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();  
       
		String name = request.getParameter("username");  
		String pass =request.getParameter("userpass");  
		String mail = request.getParameter("usermail");
		String count =request.getParameter("userCountry");  
		          
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(url, username, password);
		
		PreparedStatement ps=con.prepareStatement("insert into csuser values(?, ?, ?, ?)");  
		  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		ps.setString(3,mail);  
		ps.setString(4, count);
		
		int i=ps.executeUpdate();  
		
		if(i>0)  
		{
		response.sendRedirect("Login.jsp");
		}     
		              
		}
		catch (Exception e2) 
		{
			System.out.println(e2);
		}  
		out.close();  
	}
}
