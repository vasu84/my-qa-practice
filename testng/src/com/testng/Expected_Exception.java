package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions =NullPointerException.class)
public void demo() {
	// TODO Auto-generated method stub
String a = null;
int length = a.length();
System.out.println(length);
}
}
