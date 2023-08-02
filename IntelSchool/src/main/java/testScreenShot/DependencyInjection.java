package testScreenShot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.dependency_injection_screenShot.BaseTest;

public class DependencyInjection extends BaseTest {

	

	@Test(testName = "TestGoogle")
	public void TestGoogle() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		Thread.sleep(1000);
	}

	@Test(testName = "TestFacebook")
	public void TestFacebook() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		
		SoftAssert softAssert = new SoftAssert();
		
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
		
		//Border Assertion
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");
		
		//ErrorMessage Assertion
		String actualErrorMessage = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");
		
		softAssert.assertAll();
	}
	
	
	
	@Test(testName = "TestOrangeHRM")
	public void TestOrangeHRM() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	}
}
