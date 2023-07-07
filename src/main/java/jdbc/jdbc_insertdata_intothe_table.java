package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_insertdata_intothe_table 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");   
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form","root","root");
		 Statement statement=connection.createStatement();
		 statement.execute("Insert into users values(4,'sathish','s@gmail.com')");
		 statement.execute("Insert into users values(5,'kaif','k@gmail.com')");
		 statement.execute("Insert into users values(6,'roopes','r@gmail.com')");
		 
		 
		 System.out.println("data inserted succesfully in the table users");
		 
		 
		
		
	}

}
