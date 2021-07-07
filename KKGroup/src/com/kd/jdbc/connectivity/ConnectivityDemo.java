package com.kd.jdbc.connectivity;
import java.sql.*;
public class ConnectivityDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url="jdbc:postgresql://kiranakardlie98:6050/Demo";
		String uname="schoolroot";
		String pass="test@123";
		String query="select * from student";
		
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}
}
