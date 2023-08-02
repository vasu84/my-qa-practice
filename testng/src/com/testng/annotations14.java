package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations14 {

	@Test
	public void test() {
		System.out.println("test");
		
	}
	

	/*@Test
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("test2");
		
	}
	@Test(priority=0)
	public void test3() {
		System.out.println("test3");
		
	}
	
	@Test(priority=1)
	public void test4 (){
		System.out.println("test4");
		
	} */
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
		
	}
	
	@BeforeMethod
	public void beforemethod1() {
		System.out.println("beforemethod1");
		
	}
	
	@BeforeMethod
	public void beforemethod2() {
		System.out.println("beforemethod2");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
		
	}
	
	@AfterMethod
	public void aftermethod11() {
		System.out.println("aftermethod1");
	}
	

@AfterClass
public void afterclass() {
	System.out.println("afterClass");
}

@AfterSuite
public void aftersuite() {
	System.out.println("aftersuite");
}

@AfterSuite
public void aftersuite1() {
	System.out.println("aftersuite1");
}
	
}
