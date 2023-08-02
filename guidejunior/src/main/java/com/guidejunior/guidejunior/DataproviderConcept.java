package com.guidejunior.guidejunior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderConcept {
 
	
	public WebDriver driver;
	
	

	@Test(dataProvider="loginPage")
	public void testOrnge(String Name, String pWord) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC-10286\\eclipse-workspace\\seleniumBasicPractice\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://portal.intelschool.in/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(Name);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pWord);
		
		//System.out.println(Name);
	//	System.out.println(pWord);
		
	/*	WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(Name);
		
		driver.findElement(By.name("password")).sendKeys(pWord);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
	}

	@DataProvider
	 
	 public Object[][] loginPage() {

		return new Object[][] {
		/*return new Object[][] {
			{"Admin","Admin123" },
			{"Admin","Admin1234" },
			{"admin","Admin123" }
		};
		*/
			{"siva","1234"},
			{"sivaji","3456"}
	};
}}
