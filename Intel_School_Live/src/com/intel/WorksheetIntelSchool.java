package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WorksheetIntelSchool extends Login_Pgae_Intel {

	@Test(priority=0)
	
	public void worksheet() throws InterruptedException {
		
		driver.findElement(By.xpath("//p[text()='WORKSHEET']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("sheet-date")).click();
		
		Thread.sleep(1000);
		
		
		// selecting date 
		WebElement day1 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		day1.click();
		
		// selecting in time
			
		WebElement intime = driver.findElement(By.id("start-time"));
		intime.sendKeys("11:00 AM");
		
		Thread.sleep(1000);
	
		
		
		
		// selecting out time
		
				WebElement outtime = driver.findElement(By.id("end-time"));
				outtime.sendKeys("12:30 PM");
				Thread.sleep(1000);
			
		
		driver.findElement(By.id("description")).sendKeys("maths class"); // Description box
		
		driver.findElement(By.id("cancel-worksheet")).click(); // cancel button
		
		driver.findElement(By.id("submit-worksheet")).click(); // submit button
		
		Thread.sleep(5000);
	
	
	}
	
	}


