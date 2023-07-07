package dynamic_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class dynamically_updatethevalues_intothetable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
		PreparedStatement preparedstatement = connection.prepareStatement("update users set username=?,useremail=? where userid=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user id");
		int id = sc.nextInt();
		
		System.out.println("enter the username which you want to update");
		String name = sc.next();
		
		System.out.println("enter the useremail which you want to update");
		String email = sc.next();
		
		
		preparedstatement.setInt(3, id);
		preparedstatement.setString(1, name);
		preparedstatement.setString(2, email);
		
		preparedstatement.execute();
		System.out.println("data is updated");
	}

}
