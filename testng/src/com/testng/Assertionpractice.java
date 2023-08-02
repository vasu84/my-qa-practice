package com.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpractice {

	public WebDriver driver;

	@Test
	public void  browser() throws InterruptedException, AWTException {
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\XSC-10286\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
		
		driver=new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	/*	WebElement deletepopup = driver.findElement(By.xpath("//button[contains(@class,'M6CB1c')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", deletepopup);*/
	
	
		
		Robot rb= new Robot();
		
		
		driver.findElement(By.name("q")).sendKeys("orangehrm");
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		String expectedResult="orangehrm - google search";
		String actualResult =driver.getTitle();
		
		Assert.assertNotEquals(actualResult, expectedResult, "do properly");
		
	}

}
