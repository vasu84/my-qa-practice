package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExtraCurricalarActivitesIntelSchool extends Login_Pgae_Intel {
 
	@Test
	
	public void extraActivities() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", " ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='nav_sprite nav-extra']")).click();
		Thread.sleep(1000);
		
		WebElement sessionid = driver.findElement(By.id("session-id"));
		sessionid.click();
		
		Select si= new Select(sessionid);
		si.selectByIndex(2);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//p[@class='name'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//p[@class='name'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//p[@class='branches'])")).click();
		Thread.sleep(5000);
		
		
		
			
	}
}
