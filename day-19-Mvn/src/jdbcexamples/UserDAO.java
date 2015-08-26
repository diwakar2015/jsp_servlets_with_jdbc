/**
 * 
 */
package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdk.nashorn.internal.runtime.ECMAErrors;

import com.myjdbc.common.ConnectionFactory;

/**
 *  @author Diwakar
 *
 * Date:  Aug 24, 2015 2015
 * File: UserDAO.java
 */
public class UserDAO {
	
	
	public static int insertUser(String username, String password, String email)
	{
		
		int status = 0;
		
		String sql = "INSERT INTO user (username, password , email) VALUES (?, ?, ?)";
		try
		{
		
		Connection connection = ConnectionFactory.getConnection();
		
		
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, username);
			statement.setString(2, password);
			statement.setString(3, email);
			

			status= statement.executeUpdate();

			if (status > 0) 
				System.out.println("A new person was inserted successfully!");
		
		
		}
		catch(Exception e)
		{
			System.out.println("Exception "+ e);
		}
		
		return status;
		
	}
	
	
	public static boolean isUserValid(String username, String password)
	{
		boolean isValid = false;
		try
		{
         String sql = "select * from user where username = ?  and password = ?";
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, username);
		statement.setString(2, password);
		
		ResultSet results = statement.executeQuery();
		
		 isValid = results.next();
		
		System.out.println("isValid ==> "+isValid);
		
	
		
		}
		catch(Exception e){
		
		}
		return isValid;
	}
	
	

}
