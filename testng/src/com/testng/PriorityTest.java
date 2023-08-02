
//Priority is an attribute that tells TestNG which order the tests need to follow



package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=1)
	public void run_eclipse() {
	// TODO Auto-generated method stub
System.out.println("running eclipse successfully");
}
	@Test(priority=1)
	public void openeclipse() {
		// TODO Auto-generated method stub
		System.out.println("Opening eclipse successfully");
	}
	@Test(priority=3)
	public void closeclipse() {
		// TODO Auto-generated method stub
		System.out.println("closed the eclipse");	
	}
}
