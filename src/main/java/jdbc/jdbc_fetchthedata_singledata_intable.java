package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_fetchthedata_singledata_intable 

{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
	
	Statement statement = connection.createStatement();
	
	ResultSet resultset = statement.executeQuery("select* from users where userid");

	
		resultset.next();
		
	System.out.println(resultset.getInt(1)+"         "+resultset.getString(2)+"     " +resultset.getString(3));
	
	}

}
