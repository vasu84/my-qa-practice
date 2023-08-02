package com.java_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\java_practice\\Driver\\geckodriver.exe");
	
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
		 driver.manage().window().maximize();
	}

}
