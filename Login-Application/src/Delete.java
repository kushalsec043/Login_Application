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

@WebServlet("/Delete")
public class Delete extends HttpServlet
{
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";
	
	Connection con = null;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{    
		
		response.sendRedirect("Delete.jsp");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		String str = session.getAttribute("username").toString();
		
		String sql = "delete from csuser where name=" + str;
		
		PreparedStatement st;
		try 
		{
			st = con.prepareStatement(sql);
			st.executeUpdate();
			
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}