package com.sel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Testing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//connect url
		String url= "jdbc:mysql://localhost:3036/emp";
		String username="root";
		String pass="";
		String query ="Select *from empdet";
		
		//To load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//To create connection for daabase
		Connection con = DriverManager.getConnection(url, username, pass);
		
		//Create statement object
		Statement state = con.createStatement();
		//Execute sql
		ResultSet eq = state.executeQuery(query);
		

	}

}
