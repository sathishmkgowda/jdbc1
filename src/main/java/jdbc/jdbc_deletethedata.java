package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_deletethedata 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("delete from users where userid=4"); //if u want to delete entire database "delete from users" to be written
		System.out.println("data of that perticular thing is succesfully deleted");
		
	}

}
