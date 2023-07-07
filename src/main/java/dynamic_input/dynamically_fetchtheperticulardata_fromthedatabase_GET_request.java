package dynamic_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class dynamically_fetchtheperticulardata_fromthedatabase_GET_request
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
	     PreparedStatement preparedstatement=connection.prepareStatement("select* from users where userid=?");
	     
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter the id which do you want to fetch the details");
	     int id = sc.nextInt();
	     preparedstatement.setInt(1, id);
	     
	     ResultSet resultset=preparedstatement.executeQuery();
	    
	     while(resultset.next()) {
	     System.out.println(resultset.getInt(1)+"         "+resultset.getString(2)+"     " +resultset.getString(3));
	     
	     }	
		
	}

}
