/**
 * 
 */
package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myjdbc.common.ConnectionFactory;



/**
 *  @author Diwakar
 *
 * Date:  Aug 13, 2015 2015
 * File: MyApp.java
 */
public class MyApp {

	
	public static int updatePerson(int personID, String lastname, String firstName, String address, String city) throws ClassNotFoundException, SQLException
	{
		//String sql = "update persons set PersonID = ?, LastName ? , FirstName=?, Address = ? , City =? where personID = ?";
		
		String sql = "update persons set PersonID=?, LastName= ? , FirstName=?, Address=?, City=? where PersonID=?";
		
		PreparedStatement statement = ConnectionFactory.getConnection().prepareStatement(sql);
		
		statement.setInt(1, personID);
		statement.setString(2, lastname);
		statement.setString(3, firstName);
		statement.setString(4, address);
		statement.setString(5, city);
		statement.setInt(6, personID);
		
		
		int updatedCount = statement.executeUpdate();
		System.out.println("Updated count "+ updatedCount);
		
		return updatedCount;
		
		
		
	}
	
	
	
	public static ResultSet getAllPersons() throws ClassNotFoundException, SQLException
	{
		String sql = "select * from persons";
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet results = statement.executeQuery();
		
		/*System.out.println("Displaying all the persons...");
		
		while(results.next())
		{
		  System.out.println("ID "+ results.getInt(1));
		  System.out.println("First Name: "+ results.getString(2));  
		  System.out.println("Last Name:  "+ results.getString(3));
		  System.out.println("Address :  "+ results.getString(4));
		  System.out.println("City  "+ results.getString(5));
			
			
		}
		*/
		
		return results;
	}
	
	
	

public static int  addPerson(int PersonID, String LastName , String FirstName , String Address , String City) throws ClassNotFoundException, SQLException
{
	
	String sql = "INSERT INTO persons (PersonID, LastName , FirstName , Address , City) VALUES (?, ?, ?, ?,?)";
	
	Connection connection = ConnectionFactory.getConnection();
	
	
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, PersonID);
		statement.setString(2, LastName);
		statement.setString(3, FirstName);
		statement.setString(4, Address);
		statement.setString(5, City);

		int rowsInserted = statement.executeUpdate();

		if (rowsInserted > 0) 
			System.out.println("A new person was inserted successfully!");
	return rowsInserted;


}

public static void deletePerson(int personID) throws SQLException, ClassNotFoundException
{
	
	String sql = "delete from persons where personID= ?";
	
	Connection connection = ConnectionFactory.getConnection();
	
	PreparedStatement statement = connection.prepareStatement(sql);
	
	statement.setInt(1, personID);
	
	statement.execute();

}
	

public static ResultSet getPersonById(int id) throws ClassNotFoundException, SQLException
{

	String sql = "SELECT * FROM persons where PersonID = ?";
	
	Connection connection = ConnectionFactory.getConnection();
	
	PreparedStatement statement = connection.prepareStatement(sql);
	
	statement.setInt(1, id);
	
	ResultSet results = statement.executeQuery();
	
	return results;
	
}


	
}
