package com.seleniumBasicPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?utm_source=branch_locator&utm_medium=external_link");
	
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	WebElement continue1 = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	Thread.sleep(2000);
	continue1.click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	 String enterIntoTheAlertBox = driver.switchTo().alert().getText();
		
		System.out.println(enterIntoTheAlertBox);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}

}
