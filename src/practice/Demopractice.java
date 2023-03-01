package practice;
import java.sql.*;
public class Demopractice {
	public static void main(String[] args) throws Exception
	{
		// Establish Connectivity
		String url="jdbc:mysql://localhost:3306/University";
		String uname="root";
		String password="lot.dug.hot-83";
		String query="select * from EngineeringStudents";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String UniversityData="";
			for(int i=1;i<=6;i++) {
				UniversityData+=rs.getString(i)+":";
			}
			System.out.println(UniversityData);
		}
		st.close();
		con.close();	
	}
}
