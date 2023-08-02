package com.intel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PTAintelschool extends Login_Pgae_Intel {

	@Test(priority=0)

	public void meeting() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");

		//select pta

		driver.findElement(By.xpath("//span[@class='nav_sprite nav-meeting']")).click();
		Thread.sleep(1000);

		// selecting date 
		driver.findElement(By.id("start-date")).click();

		String monthYear="June 2023";
		String day ="10";
		// select calendar month year
		while(true) {
			String monthYear1 = driver.findElement(By.className("datepicker-switch")).getText();

			if (monthYear1.equalsIgnoreCase(monthYear)) 

				break;
			else
				driver.findElement(By.className("prev")).click();



			List<WebElement> findParticulardriver = driver.findElements(By.className("//table/tbody/tr[2]/td[7]"));

			for (WebElement date : findParticulardriver) {

				String a = date.getText();

				if(a.equals(day))
					date.click();


			}

		}


		Thread.sleep(5000);

	}
}
