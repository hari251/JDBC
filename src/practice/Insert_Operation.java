package practice;
import java.sql.*;

public class Insert_Operation 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String id="user1";
		String password="helloworld";
		String email="abc@gmail.com";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","lot.dug.hot-83");
			Statement st=con.createStatement();
			String q1 = "insert into userid values('" +id+ "', '" +password+"','" +email+ "')";
			int x = st.executeUpdate(q1);
			if (x > 0)		
				System.out.println("Successfully Inserted");		
			else		
				System.out.println("Insert Failed");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

