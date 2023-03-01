package practice;
import java.sql.*;

public class Delete_Operation 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String id = "user1";
        String password = "password";
        try
        {
            Class.forName("Drivername");
            Connection con = DriverManager.getConnection("url", "user1", "password");
            Statement st = con.createStatement();
                  
            // Deleting from database
            String q1 = "DELETE from userid WHERE id = '" + id +"' AND pwd = '" + password + "'";
            int x = st.executeUpdate(q1); 
            if (x > 0)           
                System.out.println("One User Successfully Deleted");           
            else
                System.out.println("ERROR OCCURED "); 
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

}
