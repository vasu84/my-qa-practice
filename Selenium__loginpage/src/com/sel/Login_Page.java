 package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {

	public static void main(String[] args) throws IOException, InterruptedException {
		//To interact with browser
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		//Launch browser
		WebDriver driver = new ChromeDriver();
		//launch url
		driver.get("https://www.nyinst.com/register");
		
	
		
		//Fluent wait	
		Wait a = new FluentWait(driver);
		withtimeout(30,TimeUnit.SECONDS);
		pollingEvery(10,TimeUnit.SECONDS);
		ignoring(Exception.class);
		                                        //implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Maximize
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("vasu");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.visibilityOf(name));
		
		
		Thread.sleep(2000);
		WebElement number = driver.findElement(By.name("telphone"));
		
		number.sendKeys("15885855845954444444");
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("gsdggfsa");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File ss1 =ss.getScreenshotAs(OutputType.FILE);
		File ss2 = new File("C:\\Users\\XSC-10286\\eclipse-workspace\\java2\\screenshot2\\siva.png");
		FileUtils.copyFile(ss1, ss2);
		
	}

	private static void ignoring(Class<Exception> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void withtimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}
