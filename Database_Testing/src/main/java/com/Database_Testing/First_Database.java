package com.Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class First_Database {
	public static Connection connection;
	public static Statement stmt;
	public static ResultSet rs;
	
	
	@BeforeSuite
	public static void setup() throws SQLException {
		// TODO Auto-generated method stub
 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");
	}
	
	@AfterSuite
	public static void tearDown() throws SQLException {
		// TODO Auto-generated method stub
connection.close();
	}
	 @Test
	public static  void selectOrders() throws SQLException {
		// TODO Auto-generated method stub
stmt = connection.createStatement();
 rs = stmt.executeQuery("select * from orders;");
 
 while (rs.next()) {
	
	 int ccount = rs.getMetaData().getColumnCount();
	System.out.println("The column count:"+ccount);
	for(int i=1;i<=ccount;i++) {
		String result = rs.getString(i);
		System.out.println(result);
	}
}
 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
