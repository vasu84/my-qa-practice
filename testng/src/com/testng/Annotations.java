

// Annotations are used to describe a batch of code inserted into the program or
//business logic used to control the flow of methods in the test script


package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
 @BeforeSuite
 public void analysier() {
	System.out.println("lokesh");
 }
 @BeforeTest
 private void designer() {
	// TODO Auto-generated method stub
	 System.out.println("pavan");
}
@BeforeClass
 private void developer() {
	// TODO Auto-generated method stub
	System.out.println("praveen");
} 
@BeforeMethod 
private void deployer11() {
	// TODO Auto-generated method stub
	System.out.println("ch");
}

@BeforeMethod 
private void deployer2() {
	// TODO Auto-generated method stub
	System.out.println("chan");
}

@BeforeMethod         // all before and after methods will execute every time when "@Test" method is execute ,
                               //here @Test is execute 3 times so every before and after methods will execute 3 times .  
private void deployer3() {
	// TODO Auto-generated method stub
	System.out.println("chander");
}

@Test(priority=1) // it will execute after tester2 ,and tester3 only

private void tester1() {
	// TODO Auto-generated method stub
	System.out.println("Siva");
	
}
@Test
private void tester2() {
	// TODO Auto-generated method stub
	System.out.println("va");
	
}
@Test
private void tester3() {
	// TODO Auto-generated method stub
	System.out.println("mahaboob");
	
}
@AfterMethod
public void analysier1() {
	System.out.println("ma");
}

@AfterMethod
public void analysier2() {
	System.out.println("maha");
}
@AfterMethod
public void analysier3() {
	System.out.println("mahade");
}
@AfterMethod
public void analysier4() {
	System.out.println("mahadevvv");
}


@AfterClass
private void designer1() {
	// TODO Auto-generated method stub
	 System.out.println("Vasu");
}
@AfterTest
private void developer1() {
	// TODO Auto-generated method stub
	System.out.println("gokul");
} 
@AfterSuite
private void deployer1() {
	// TODO Auto-generated method stub
	System.out.println("aditya");
}
}
