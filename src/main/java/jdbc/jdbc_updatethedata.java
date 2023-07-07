package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_updatethedata 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("update users set username='kf@gmail.com',useremail='kghgff' where userid=2");
		System.out.println("updated");
		
		
	}

}
