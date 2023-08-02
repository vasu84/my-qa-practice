package com.seleniumBasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//Text box
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		
		String month="September";
		String day="10";
		String year ="2023";
		
		while(true) {
			
			String month1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			String year1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
			if (month1.equalsIgnoreCase(month)&&year1.equals(year)) 
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			
		}
		
		
	 List<WebElement> particulardata  = driver.findElements(By.xpath("//table/tbody/tr[3]/td[1]"));
for (WebElement a : particulardata) {
	String text = a.getText();
	if (text.equals(day)) {
		a.click();
	}
}
		
	}

}
