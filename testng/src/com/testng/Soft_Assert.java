package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	//Soft assert -verification
public void demo() {
	// TODO Auto-generated method stub
		String expected="iuhgjh";
		String actual="xcel";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
}
	@Test()
	//Hard assert -validation
	public void demo2() {
		// TODO Auto-generated method stub
String expected="Java";
String actual="java";
Assert.assertEquals(actual, expected);
System.out.println("validation");
	}
}
