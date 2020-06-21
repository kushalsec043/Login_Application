
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao 
{
	String sql = "select * from csuser where username=? and userpass=?";
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";
	
	public boolean check(String uname, String pass) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password);
		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, uname);
		st.setString(2, pass);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		
		return false;
	}
	
}
