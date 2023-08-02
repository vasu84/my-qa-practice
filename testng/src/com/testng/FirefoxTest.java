package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirefoxTest {
	

		public WebDriver driver; 
		@BeforeTest
		public void beforeTest() {
			System.out.println("Initilizing the Google Chrome Driver");
			System.setProperty("webdriver.gecko.driver",
	    			"C:\\Users\\XSC-10286\\eclipse-workspace\\testng\\drivers\\geckodriver.exe");
	    	driver = new FirefoxDriver();	  
	    
		}
	        @Test
	 	public void FirefoxTestMethod()
	 	{ 

		  //Initialize the chrome driver
		 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		 driver.get("https://www.facebook.com/signup"); 
		 
	    }
	 
	     @AfterTest
	     public void afterTest() {
	     	 
		 System.out.println("Closing the browser ");
		 driver.close();
	     }

}
