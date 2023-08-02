package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Pgae_Intel {

	
	public static WebDriver driver;

	@BeforeTest

	public void browserLaunch() throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://portal.intelschool.in/");

		driver.manage().window().maximize();

		//driver.findElement(By.linkText("Login")).click();

		/*Set<String> windowHandles = driver.getWindowHandles(); // handling multiple windows

	    for (String string : windowHandles) {

		driver.switchTo().window(string).getTitle();*/

		driver.findElement(By.id("username")).sendKeys("rajkamal");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Guruom@5");
		Thread.sleep(2000);

		driver.findElement(By.id("user-login")).click();
		Thread.sleep(5000);



	}
}
