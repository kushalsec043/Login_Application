import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet
{
	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		LoginDao dao = new LoginDao();
		
			try {
				if(dao.check(uname, pass))
				{
						HttpSession session = request.getSession();
						session.setAttribute("username", uname);
						session.setAttribute("pass", pass);
						
						response.sendRedirect("MyListen");
				}
				else
				{
						response.sendRedirect("register.jsp");
				}
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
