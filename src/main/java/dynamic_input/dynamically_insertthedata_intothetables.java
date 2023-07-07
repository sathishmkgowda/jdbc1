package dynamic_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class dynamically_insertthedata_intothetables {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		
		PreparedStatement preparedstatement = connection.prepareStatement("insert into users values (?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user id");
		int id = sc.nextInt();
		
		System.out.println("enter the username");
		String name = sc.next();
		
		System.out.println("enter the useremail");
		String email = sc.next();
	

		preparedstatement.setInt(1, id);
		preparedstatement.setString(2, name);
		preparedstatement.setString(3, email);
			
		preparedstatement.execute();
		System.out.println("data is inserted");
		
		

	}

}
