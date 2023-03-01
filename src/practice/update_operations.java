package practice;
import java.sql.*;
public class update_operations {
	public static void main(String[] args) throws Exception
	{
		// Establish Connectivity
		String url="jdbc:mysql://localhost:3306/University";
		String uname="root";
		String password="lot.dug.hot-83";
		String First_Name = "Rakesh";
		//String Last_Name = "Gupta";
		int Student_ID = 15;
		String query="UPDATE EngineeringStudents set First_Name = '"+First_Name+"'WHERE Student_ID = '"+Student_ID+"'";		//String query2="select * from EngineeringStudents";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		//ResultSet rs = st.executeQuery(query);//ResultSet rs2 = st.executeQuery(query2);
		/*
		while(rs.next()) {
			String UniversityData="";
			for(int i=1;i<=6;i++) {
				UniversityData+=rs.getString(i)+":";
			}
			System.out.println(UniversityData);
		}
		*/
		System.out.println(count+"row/s affected");
		st.close();
		con.close();
	}
}
