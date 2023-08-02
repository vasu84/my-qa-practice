package com.java2_samplework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\XSC-10286\\eclipse-workspace\\java2\\drivercr\\chromedriver.exe");
                     // launching browser
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
                   //Maximize
driver.manage().window().maximize();
WebElement mail = driver.findElement(By.id("email"));
mail.sendKeys("vgynvfahgash@gma");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("cvjksdnf351549dvkjzb");
Thread.sleep(2000);
//WebElement showpassword = driver.findElement(By.className("_9lsb _9ls9"));
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div")).click();
Thread.sleep(2000);
WebElement login = driver.findElement(By.name("login"));
login.click();
	}

}
