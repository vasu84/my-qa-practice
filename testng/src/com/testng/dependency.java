

package com.testng;


import org.testng.annotations.Test;

public class dependency {

	@Test
	public void college() {
		System.out.println("ANU");
	}
	
	@Test
	public void university() {
		System.out.println("andhrauni");
	}
	
    
	@Test(dependsOnMethods="university", enabled=false)

	public void highSchool() {
		System.out.println("zph");
	}

	@Test(dependsOnMethods="highSchool")

	public void nyinst() {
		System.out.println("learningplatform");
	}
}
