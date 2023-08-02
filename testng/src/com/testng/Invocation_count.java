
// InvocationCount is used when we want to run the same test multiple times.

package com.testng;

import org.testng.annotations.Test;

public class Invocation_count {

	@Test(priority=1,invocationCount=3)
	public void run_eclipse() {
	// TODO Auto-generated method stub
System.out.println("Running eclipse ");
}
	@Test(priority=-1,invocationCount=5)
	public void openeclipse() {
		// TODO Auto-generated method stub
		System.out.println("Opening eclipse ");
	}
	@Test(priority=3)
	public void closeeclipse() {
		// TODO Auto-generated method stub
		System.out.println("Closed the eclipse");	
	}
}
