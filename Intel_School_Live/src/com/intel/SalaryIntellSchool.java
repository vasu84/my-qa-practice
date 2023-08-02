package com.intel;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SalaryIntellSchool extends Login_Pgae_Intel {

	@Test(priority=0)

	public void salary() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.linkText("SALARY")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//p[@class='name'])[2]")).click(); // pay date
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//p[@class='name'])[3]")).click();  //start period
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//p[@class='name'])[4]")).click();  // end period
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//p[@class='name'])[5]")).click();  //net amount
		Thread.sleep(1000);

		//window handle

		String parentwindowHandle = driver.getWindowHandle();

		// clicking pay slip
		driver.findElement(By.xpath("(//p[@class='branches justify-content-center'])[1]")).click();
		Thread.sleep(1000);

		// handle two windows(main and salary)
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			
			System.out.println(driver.switchTo().window(string).getTitle());
			
			if(!string.equals(parentwindowHandle)) {
				driver.findElement(By.id("print-paySlip")).click();
			}
				
		}
		
          System.out.println(driver.switchTo().window(parentwindowHandle).getTitle()); // its return to parent window and we get the title name
          
          
          Thread.sleep(5000);

	}

}
