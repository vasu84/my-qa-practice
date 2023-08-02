package com.seleniumBasicPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\fbsignup\\chrmdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://uidai.gov.in/en/");

		driver.manage().window().maximize();

		String parentWindowHandle = driver.getWindowHandle();

		System.out.println("my parent window handle is -- " + parentWindowHandle);

		Thread.sleep(2000);
		/*JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);", "");*/
		
		driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("View On Dashboard")).click();
		
	
		Set<String> windowHandles = driver.getWindowHandles(); // every window has a unique address for storing unique elements so we use "set" of string
		// "list" string may return duplication values so here we didn't use 

		for (String windowHandle : windowHandles) {
			
			System.out.println(windowHandle);
			
			System.out.println(driver.switchTo().window(parentWindowHandle).getTitle());

		}

driver.quit();
	}

}
