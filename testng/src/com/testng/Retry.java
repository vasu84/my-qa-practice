package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Retry {
	
	@Test(retryAnalyzer=Rerun.class)
	public void demo() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\XSC-10286\\eclipse-workspace\\seleniumBasicPractice\\chrome driver\\chromedriver.exe" );

WebDriver driver = new ChromeDriver();

 driver.get("https://www.fa");
 driver.manage().window().maximize();
 
 driver.findElement(By.id("email")).sendKeys("asdgvasjdfbd@gmail.com");
 
 driver.findElement(By.xpath("//button[@name='login']")).click();
 
 driver.quit();
 
}
	
	public void orangeHrm(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\seleniumBasicPractice\\chrome driver\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 
		 driver.findElement(By.name("password")).sendKeys("Admin123546978");
	
		 driver.findElement(By.name("password")).click();
	}
}
