package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcconnectiontomysql  
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//to create a connection to mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		System.out.println("connection is established");
		
		
	}

}
