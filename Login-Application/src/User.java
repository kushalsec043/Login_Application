
public class User
{
	private String name,password,email;  
	  
	public String getName() 
	{  
	    return name;  
	}  
	public void setName(String name) 
	{  
	    this.name = name;  
	}  
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	public String getPassword() 
	{  
	    return password;  
	}  
	public void setPassword(String password) 
	{  
	    this.password = password;  
	}  
	
	public String getemail()
	{
		return email;
	}
	public void setemail(String email)
	{
		this.email = email;
	}
}
