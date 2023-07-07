package dynamic_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class switchcases_using_dynamicallyinput 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form", "root", "root");
		Scanner scanner = new Scanner(System.in);
	   System.out.println("select case1 to insert the data and" +"   "+"case2 for update the data"+" "+"case3 for deletethe data"+" " +"case4 feththe data");
		int a = scanner.nextInt();
		
		switch (a) {
		case 1:
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
			break;
			
		case 2:

			PreparedStatement preparedstatement1 = connection.prepareStatement("update users set username=?,useremail=? where userid=?");
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter the user id");
			int id1 = sc1.nextInt();
			
			System.out.println("enter the username which you want to update");
			String name1 = sc1.next();
			
			System.out.println("enter the useremail which you want to update");
			String email1 = sc1.next();
			
			
			preparedstatement1.setInt(3, id1);
			preparedstatement1.setString(1, name1);
			preparedstatement1.setString(2, email1);
			
			preparedstatement1.execute();
			System.out.println("data is updated");
			break;
			
		case 3:
			PreparedStatement preparedstatement2=connection.prepareStatement("delete from users where userid=?");
		     
		     Scanner sc2 = new Scanner(System.in);
		     System.out.println("enter the id which do you want to delete the details");
		     int id2 = sc2.nextInt();
		     preparedstatement2.setInt(1, id2);
		     
		     preparedstatement2.execute();
		    System.out.println("data is deleted succesfully");
		    break;
		case 4:
			PreparedStatement preparedstatement3=connection.prepareStatement("select* from users where userid=?");
		     
		     Scanner sc3 = new Scanner(System.in);
		     System.out.println("enter the id which do you want to fetch the details");
		     int id3 = sc3.nextInt();
		     preparedstatement3.setInt(1, id3);
		     
		     ResultSet resultset=preparedstatement3.executeQuery();
		    
		     while(resultset.next()) {
		     System.out.println(resultset.getInt(1)+"         "+resultset.getString(2)+"     " +resultset.getString(3));
		     
		     }	
		     break;

		default:
			System.out.println("entered value is inavlid please choose the number between 1to4");
			break;
		}
		
		
		
		
	}

}
