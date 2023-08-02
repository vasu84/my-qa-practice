package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	WebDriver driver;
	@Parameters({"username","password"})
	
	@Test
	
	
	public void login(@Optional("siva")String username,@Optional("1234")String password) {
		// TODO Auto-generated method stub
System.out.println("The user name is:"+username);
System.out.println("The password is :"+password);
	}
	
	
	@Parameters({"browserLaunch","url"})
	
	@BeforeTest
	
	public void edge(String browserLaunch,String url) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\java_practice\\Driver\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		Thread.sleep(5000);	
		driver.get(url);
	
		
	}
	@Parameters({"browserLaunch","url"})
	@Test(priority=1)
	public void fireFox(String browserLaunch,String url) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\java_practice\\Driver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get(url);
	}
	
	/*@Parameters("url")
	@Test
	public void geturl(String url) throws InterruptedException {
		
		driver.get(url);
	}*/
	
	
	@Parameters({"UserName","PassWord"})
	
	@Test(priority=2,enabled=false)
	
	public void loginDetails(String UserName, String PassWord) {
		
		driver.findElement(By.name("username")).sendKeys(UserName);
		
		driver.findElement(By.name("password")).sendKeys(PassWord);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

}
}