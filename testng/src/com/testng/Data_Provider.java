package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="input")
public void demo(String username,String password) {
	// TODO Auto-generated method stub
System.out.println("The username is :"+username);
System.out.println("The password is :"+password);
}
	@DataProvider
	public Object[][] input() {
		// TODO Auto-generated method stub
return new Object[][] {
	{"siva","1234"},
	{"Vasu","123412"},
	{"Geetha","123456"},
	{"My Geetha","1234836"},
};
	}
}
