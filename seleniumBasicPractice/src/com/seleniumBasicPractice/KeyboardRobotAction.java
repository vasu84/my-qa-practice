package com.seleniumBasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardRobotAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", 
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	}

}
