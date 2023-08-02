package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CertificateRequest extends Login_Pgae_Intel {

	@Test(priority=1)

	public void certificate() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");

		//select Certificate

		driver.findElement(By.xpath("//span[@class='nav_sprite nav-certificate']")).click();
		Thread.sleep(1000);

		// adding certificate
		driver.findElement(By.id("add-request-btn")).click();

		Thread.sleep(2000);

		WebElement addCerti = driver.findElement(By.id("certificate_type"));
		addCerti.click();

		JavascriptExecutor certificate=(JavascriptExecutor) driver;
		certificate.executeScript("arguments[0].value='3230'", addCerti);

		//description
		driver.findElement(By.id("description")).sendKeys("gyvcskldyish djhaSFLFMD ytdfzldkfd^Tfgtbskfja86tfsr rlkyQUINGQITTwge");
		Thread.sleep(2000);
		
		// reset button

		driver.findElement(By.id("cancel_request")).click();
		 Thread.sleep(2000);
		 
		//close button
		driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		
        
		Thread.sleep(5000);



	}

}
