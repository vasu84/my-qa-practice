package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TimeTableIntellSchool extends Login_Pgae_Intel {
	
	@Test(priority=0)
	public void timetable() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@class='nav_sprite nav-timeTable']")).click();
		 
	// add button
	
	driver.findElement(By.xpath("//span[text()='Add']")).click();
	 
	// selecting year
	WebElement year = driver.findElement(By.id("session-id"));
	year.click();
	
	Select y = new Select(year);
	y.selectByIndex(2);
	
	Thread.sleep(1000);
	
  // selecting class
	WebElement classSelect = driver.findElement(By.id("class-id"));
	classSelect.click();
	Thread.sleep(1000);
	
	Select cs = new Select(classSelect);
	cs.selectByIndex(1);
	
	Thread.sleep(2000);
	}
	
	
	@Test(priority=1,invocationCount=3)
	public void adding() throws InterruptedException {
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", " ");
		
		// add row for period
	driver.findElement(By.xpath("//a[@class='row_add']")).click();
	Thread.sleep(1000);
	
	
	
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	
	Thread.sleep(2000);
	
	}
	
	 @Test(priority=2,invocationCount=2)
		public void deleting() throws InterruptedException {
		 
	// delete that 
	driver.findElement(By.xpath("//a[@class='row_delete']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	
	Thread.sleep(5000);
	 
	 }
	

}
