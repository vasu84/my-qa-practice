/**
 * 
 */
package com.seleniumBasicPractice;

import org.testng.annotations.Test;

/**
 * @author XSC-10286
 *
 */
public class Grouping {
	@Test(groups = "a")
	public void groupA1() {
		System.out.println("groupa");
		
		
	}
	@Test(groups = "a")
	public void groupA2() {
		System.out.println("groupa");
		
		
	}
	@Test(groups = "b")
	public void groupB1() {
		System.out.println("groupb");
		
		
	}
	@Test(groups = "b")
	public void groupB2() {
		System.out.println("groupb2");
		
		
	}
	@Test(groups = "c")
	public void groupC1() {
		System.out.println("groupc");
		
		
	}
	@Test(groups = "c")
	public void groupC2() {
		System.out.println("groupc2");
		
		
	}

}
