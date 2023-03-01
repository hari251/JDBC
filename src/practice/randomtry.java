package practice;
import java.sql.*;
public class randomtry {

	public static void main(String[] args) throws Exception
	{
		// Establish Connectivity
		String url="jdbc:mysql://localhost:3306/University";
		String uname="root";
		String password="lot.dug.hot-83";
		String query="insert into EngineeringStudents values(15,'EIE','Ankeesh','Thappar',2022,225)";		//String query2="select * from EngineeringStudents";		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		//ResultSet rs = st.executeQuery(query);
		//ResultSet rs2 = st.executeQuery(query2);
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
