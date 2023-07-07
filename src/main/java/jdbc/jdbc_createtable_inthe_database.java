package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_createtable_inthe_database
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("create table users(userid integer primary key,username varchar(20),useremail varchar(20))");
		
		System.out.println("new user table successfully created with userid,username,useremail columns");
		
	}

}
