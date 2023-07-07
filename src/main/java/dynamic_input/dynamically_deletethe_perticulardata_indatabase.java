package dynamic_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class dynamically_deletethe_perticulardata_indatabase 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
	
     PreparedStatement preparedstatement=connection.prepareStatement("delete from users where userid=?");
     
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the id which do you want to delete the details");
     int id = sc.nextInt();
     preparedstatement.setInt(1, id);
     
     preparedstatement.execute();
    System.out.println("data is deleted succesfully");
	
}
}
