package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
            //Initializing the firefox driver (Gecko)
	    
        	System.setProperty("webdriver.gecko.driver",
        			"C:\\Users\\XSC-10286\\eclipse-workspace\\testng\\drivers\\geckodriver.exe");
        	driver = new FirefoxDriver();	  
	    driver.get("https://www.facebook.com/signup"); 
	    driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()
 	{ 
	  //Initialize the chrome driver
        	System.setProperty("webdriver.chrome.driver",
        			"C:\\Users\\XSC-10286\\eclipse-workspace\\fbsignup\\chrmdriver\\chromedriver.exe");
        driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/signup"); 
	 // driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	 driver.manage().window().maximize();
	  driver.quit();
 	}

}
