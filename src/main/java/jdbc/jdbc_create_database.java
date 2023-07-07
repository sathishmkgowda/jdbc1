package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_create_database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("create database login_form");
		
		System.out.println("new login database is succesfully created");

	}

}
