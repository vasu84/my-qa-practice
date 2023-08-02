
// intelschool


package com.seleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://portal.intelschool.in/teacher/dashboard");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("rajkamal");
		driver.findElement(By.id("password")).sendKeys("Guruom@5");
		driver.findElement(By.id("user-login")).click();
		Thread.sleep(2000);

		// child axis

		driver.findElement(By.xpath("//div[@class='col-3 text-center th']//child::p")).click();

		Thread.sleep(2000);

		// parent  , div dropdown element is parent class and exam is child

		driver.findElement(By.xpath("//div[@class='dropdown-submenu']//parent::a[1]")).click();
		Thread .sleep(2000);

		// following
		driver.findElement(By.xpath("//li[@class='dropdown-item active']//following::li[2]")).click();
		Thread .sleep(2000);

		// descendant
		driver.findElement(By.xpath("//li[@class='drop_up ']//descendant::a[1]")).click();
	}

}
