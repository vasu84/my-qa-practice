package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ChromeTest {
	public WebDriver driver;
 
	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Google Chrome Driver");
		System.setProperty("webdriver.chrome.driver",
    			"C:\\Users\\XSC-10286\\eclipse-workspace\\fbsignup\\chrmdriver\\chromedriver.exe");
    driver = new ChromeDriver();
   
	}

        @Test
 	public void ChromeTestMethod()
 	{ 
	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	 driver.get("https://www.facebook.com/signup"); 
	  
       }
 
       @AfterTest
       public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
       }
}