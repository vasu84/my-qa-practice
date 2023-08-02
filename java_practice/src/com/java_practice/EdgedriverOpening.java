package com.java_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgedriverOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\java_practice\\Driver\\msedgedriver.exe");
	
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.office.com/");
		driver.manage().window().maximize();
	}

}
