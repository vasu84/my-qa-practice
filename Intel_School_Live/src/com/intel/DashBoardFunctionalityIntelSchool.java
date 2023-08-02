package com.intel;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DashBoardFunctionalityIntelSchool extends Login_Pgae_Intel {
	@Test(priority=0)

	public void dashboard() throws Exception {
		// TODO Auto-generated method stub
		//Actions a = new Actions(driver);
		
	
		driver.findElement(By.xpath("//span[contains(@class,'nav_sprite nav-dashboard')]")).click();
		Thread.sleep(2000);
	}
		@Test(priority=1)
		public void view() throws InterruptedException
		{
		//driver.findElement(By.xpath("(//a[text()='Notice'])[2]")).click();
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400);", "");*/
			
		//driver.findElement(By.xpath("//a[text()='Notice'])[2]")).click();
		//Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.linkText("SUBJECT"));
		subject.click();

         Thread.sleep(5000);
	
		}


}