package practice;
import java.sql.*;
/*
 * 1.import -->java.sql
 * 2.load and register-->Use Drivers(com.jdbcdriver,oracle driver,....)
 * 3.Create Connection-->Connection
 * 4.Create a statement-->Statement,Preferred Statement,Callable Statement
 * 5.Execute the query
 * 6.Process the results
 * 7.Close
 */
public class Connection_establish 
{
	public static void main(String[] args) 
	{
		// Java Database Connectivity (JDBC)
		try
		{
			Class.forName("Driver name");
			Connection con = DriverManager.getConnection("url,username,password");
			if (con != null)			
				System.out.println("Connected");		
			else		
				System.out.println("Not Connected");	
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
