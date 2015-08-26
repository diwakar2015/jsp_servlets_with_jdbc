/**
 * 
 */
package com.myjdbc.common;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  @author Diwakar
 *
 * Date:  Aug 18, 2015 2015
 * File: ConnectionFactory.java
 */
public class ConnectionFactory {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/studentdb";

	// static final String DB_URL = "jdbc:mysql://<IPADDRESS>/user";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	private static  Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if(connection==null)
		{
			Class.forName(JDBC_DRIVER); // Loading the driver

			// Getting the connection from DriverManager
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);

			return connection;
		}

		else
			return connection;

	}

}
