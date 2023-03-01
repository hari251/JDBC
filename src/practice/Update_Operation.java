package practice;
import java.sql.*;

public class Update_Operation 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String id = "user1";
        String password = "abcd";
        String newPassword = "wxyz";
        try
        {
            Class.forName("Drivername");
            Connection con = DriverManager.getConnection("url", "username", "password");
            Statement st = con.createStatement();
         
            // Updating database
            String q1 = "UPDATE userid set password = '" + newPassword +"' WHERE id = '" +id+ "' AND password = '" + password + "'";
            int x = st.executeUpdate(q1); 
            if (x > 0)           
                System.out.println("Password Successfully Updated");           
            else           
                System.out.println("ERROR");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

}
