package com.intel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteTestNG {
	WebDriver driver;
	

	@BeforeSuite
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 long startTime= System.currentTimeMillis();
		 
		
	}
	@Test
	public void Examples1()
	{
	
		
		
		driver.get("https://www.google.com/");
		System.out.print("a");
		
	}
	@Test
	public void Examples2()
	{
	
	
		driver.get("https://www.bing.com/");
		System.out.print("b");
	}
	@Test
	public void Examples3()
	{
	
		driver.get("https://www.yahoo.com/");
		System.out.print("c");
	}
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		driver.quit();
		long endTime= System.currentTimeMillis();
		long startTime = 0;
		//long startTime = 0;
		long totalTime= endTime-startTime;
		System.out.print("totalTimeTaken"+ totalTime);
	
		Thread.sleep(5000);
	}
	

}

