package com.seleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\XSC-10286\\eclipse-workspace\\seleniumBasicPractice\\chrome driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://portal.intelschool.in/");
	
	//driver.manage().window().fullscreen();
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	WebElement username = driver.findElement(By.id("username"));
	
	Actions ac= new Actions(driver);
	ac.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "u go and die").keyUp(username, Keys.SHIFT).sendKeys(username, "my way highway").doubleClick(username).build().perform();

	WebElement password = driver.findElement(By.id("password"));
	ac.moveToElement(password).click().keyUp(password, Keys.SHIFT).sendKeys(password, "yugbdnlsgfyujsdzkoshfds").doubleClick(password).build().perform();
	}

}
