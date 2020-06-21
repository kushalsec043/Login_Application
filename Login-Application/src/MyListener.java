import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyListen")
public class MyListener extends HttpServlet 
{  
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";  
	
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {  
          
  ArrayList list=new ArrayList();  
  
   try
   {  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con = DriverManager.getConnection(url, username, password);
		
    PreparedStatement ps=con.prepareStatement("select * from csuser");  
    ResultSet rs=ps.executeQuery();  
    
    while(rs.next())
    {  
     User u=new User();  
     
     u.setName(rs.getString(1));  
     u.setPassword(rs.getString(2));  
     u.setemail(rs.getString(3));
     
     list.add(u);  
    }  
    con.close();  
              
   }
   catch(Exception ex)
   {
	   System.out.print(ex);
   }  
   
 //creating ServletContext object  
   ServletContext e=getServletContext();  
   e.setAttribute("data",list);  
   
   response.sendRedirect("option.jsp");
          
 }  
 public void contextDestroyed(ServletContextEvent arg0) {  
    System.out.println("project undeployed...");  
 }  

}
