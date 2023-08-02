package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
 driver.get("https://www.w3schools.com/java/java_encapsulation.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// scroll down
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1500)");
	
	Thread.sleep(1000);
	//scroll up
	
	//JavascriptExecutor js1= (JavascriptExecutor) driver;
/*	js.executeScript("window.scrollBy(0,-2500)", " ");
		Thread.sleep(1000);*/
		
		//scroll until the element is visible
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		//js2.executeScript("arguments [0]", scrollIntoView (true);",element");
		
		
		WebElement gs = driver.findElement(By.xpath("(//a[text()='Get Certified'])[4]"));
		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get your own Java Server')]")));
		js2.executeScript("arguments[0].scrollIntoView(true);", gs);
		//driver.close();
		                   
		// scroll down to bottom of the line
		
		//JavascriptExecutor js3=(JavascriptExecutor) driver;
	/*	js.executeScript("window.scrollBy(0,document.body.scrollheight)");
		driver.close();*/
	
	}

}
