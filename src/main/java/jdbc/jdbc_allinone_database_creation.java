package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_allinone_database_creation
{
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			Statement statement = connection.createStatement();
			
			statement.execute("create database registration");
			
			
			Connection connectregister = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
			
			Statement statement1 = connectregister.createStatement();
			statement1.execute("create table usersdata(userid integer primary key,username varchar(20),useremail varchar(20))");
			
			 statement1.execute("Insert into usersdata values(1,'sathish','s@gmail.com')");
			 statement1.execute("Insert into usersdata values(2,'kaif','k@gmail.com')");
			 statement1.execute("Insert into usersdata values(3,'roopes','r@gmail.com')");
			 statement1.execute("Insert into usersdata values(4,'sathish','s@gmail.com')");
			 statement1.execute("Insert into usersdata values(5,'kaif','k@gmail.com')");
			 statement1.execute("Insert into usersdata values(6,'roopes','r@gmail.com')");
			 
			 ResultSet resultset = statement1.executeQuery("select* from usersdata");
			 
			 for (int i = 1; i <=6; i++) 
			 {
				 resultset.next();
				System.out.println("id:"+resultset.getInt(1)+"     "+"username:"+resultset.getString(2)+"     "+"email"+resultset.getString(3));
				
		   	}
			 
			 
			 System.out.println("updating the data");
			 
			 statement1.execute("update usersdata set username='hihello',useremail='hihi' where userid=4");
			 
			 System.out.println("4th userdata username and user email is succesfully created");
			 
			 statement1.execute("delete usersdata where userid=4");
			 
			 
			 
			 
			
			
			
		
	}

}
