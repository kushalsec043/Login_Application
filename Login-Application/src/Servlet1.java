import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Videos")
public class Servlet1 extends HttpServlet
{  
	 public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	 {  
		 response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

		 		response.setContentType("text/html");
			    PrintWriter out = response.getWriter(); 
			          
			    ServletContext context=getServletContext();  
			    List list=(List)context.getAttribute("data");  
			          
			    Iterator itr=list.iterator();  
			    
			    while(itr.hasNext())
			    {  
			     User u=(User)itr.next();  
			     out.print("<br>" + u.toString());  
			    }  
			   
			    out.println("<br>" +"<a href=\"option.jsp\">Go to Options Page</a>");
			    out.close();  
			    }  
			  
			}  
