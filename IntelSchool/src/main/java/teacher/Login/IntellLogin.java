package teacher.Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntellLogin {
	WebDriver driver;
	@Test
	//@BeforeTest
	public  void browse() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		 driver= new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("intelschool");

		Thread.sleep(2000);

		Robot rb= new Robot(); 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		String expectedResult="intelschool - Google Search";
		String actualResult =driver.getTitle();

		Assert.assertEquals(actualResult, expectedResult, "do properly");
	
	driver.findElement(By.xpath("//h3[text()='School Management System | Education Software Online ...']")).click();
	
	}
	

	
	/*@Test
	public void clicking(WebElement element ) { // selecting an web element and performing click action
		element.click();
	}
	
	public void givingInput(WebElement element, String input) {// selecting an web element and giving input 
		element.sendKeys(input);
		
	}
	
	public void assertequal(String actualresult,String expectedresult, String condition) {
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(actualresult, expectedresult);
		
		sa.assertNotEquals(actualresult, expectedresult);
		
		sa.assertTrue(false);
		
		sa.assertFalse(true);
		
		sa.assertNull(condition);
		
		sa.assertNotNull(condition);
		
	}*/
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
}
