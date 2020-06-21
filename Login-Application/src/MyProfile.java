import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

@WebServlet("/MyProfile")
public class MyProfile extends HttpServlet
{
	
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{    
		response.sendRedirect("ViewProfile.jsp");
		
		HttpSession session = request.getSession();
		String str = session.getAttribute("username").toString();
		
		String sql = "select * from csuser";
		
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		session.setAttribute("username", rs.getString(1));
		session.setAttribute("password", rs.getString(2));
		session.setAttribute("email", rs.getString(3));
		session.setAttribute("country", rs.getString(4));
		
		}
		catch(Exception e)
		{
			System.out.println("Error with accessing user info...");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
