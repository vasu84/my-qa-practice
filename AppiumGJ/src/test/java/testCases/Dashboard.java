
package testCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Dashboard extends BaseClass{
	/*	MobileElement connect;
	MobileElement connected;
	MobileElement askmentor;
	MobileElement beingmentor;
	MobileElement requestedmentor; 

	@Test(priority=0)
	public void home() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.findElement(By.id("com.guidejunior:id/navigation_bar_item_icon_view")).click();
		Thread.sleep(2000);

		String ActualTitle=driver.findElement(By.xpath("//*[@text='Hi Rajiiii....B ']")).getText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ExpectedTitle="Hi Rajiiii....B ";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		Thread.sleep(2000);

	}
	@Test(priority=1)
	public void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='search']")).click();
		Thread.sleep(2000);

		//driver.findElement(By.id("com.guidejunior:id/search_bar")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search for mentors by name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.guidejunior:id/search_edit_text")).sendKeys("Avinash");
		Thread.sleep(2000);
		driver.findElement(By.id("com.guidejunior:id/row_mentor_name")).click();

		//driver.findElement(By.xpath("//*[@text='Avinash Kumar Singh ']")).click();
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void profile() throws InterruptedException
	{
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000)"));
		Thread.sleep(2000);

		connect=driver.findElement(By.id("com.guidejunior:id/connect"));
		connected=driver.findElement(By.id("com.guidejunior:id/connect_label"));
		if(connected.isDisplayed())
		{
			System.out.println("It was already connected");
		}
		else
		{
			System.out.println("It was not connected");
			connect.click();
		}
	}
	@Test(priority=3)
	public void mentor() throws InterruptedException
	{
		askmentor=driver.findElement(By.id("com.guidejunior:id/mentor"));
		beingmentor=driver.findElement(By.xpath("//*[@text='Being mentored']"));
		//askmentor=driver.findElement(By.xpath("//*[@text='Ask to be Mentor']"));




		if (!askmentor.isDisplayed())
		{	System.out.println("Ask to be mentor");
		askmentor.click();
		Thread.sleep(2000);

		}
		else 
		{
			System.out.println("Already beingmentor");
			Thread.sleep(2000);
		}

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

	}
	@Test(priority=4,enabled=false)
	public void getmentoredFor() throws InterruptedException
	{
		driver.findElement(By.id("com.guidejunior:id/subject_radio_btn")).click();
		Thread.sleep(2000);
		//  driver.findElement(By.xpath("//*[@text='SCIENCE']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.guidejunior:id/mentor_action_layout")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	 */

	@Test(priority= 1)
	public void student () throws InterruptedException {

		MobileElement ele = driver.findElement(By.xpath("//*[@text='Student']"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);

		Thread.sleep(5000);

		driver.findElement(By.id("com.guidejunior:id/update_label")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.guidejunior:id/email_log_in")).click();

		/*driver.findElement(By.id("com.guidejunior:id/sign_up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.guidejunior:id/email_input")).sendKeys("v@gmail.com");
		driver.findElement(By.id("com.guidejunior:id/password_input")).sendKeys("vasuxcel");	
		
		driver.findElement(By.id("com.guidejunior:id/update_label")).click();*/
	 Thread.sleep(2000);
	
	}

	@Test(priority=2)
	public void studentDetails() throws InterruptedException {
	
		
		
		
	driver.findElement(By.id("com.guidejunior:id/email_input")).sendKeys("vasuxcel@gmail.com");	
	
	driver.findElement(By.id("com.guidejunior:id/password_input")).sendKeys("vasuxcel");
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.guidejunior:id/update_label")).click();
	Thread.sleep(6000);

	driver.findElement(By.id("com.guidejunior:id/first_name")).sendKeys("usav");
	Thread.sleep(4000);
	
	

	 driver.findElement(By.id("com.guidejunior:id/last_name")).sendKeys("usav");
	 Thread.sleep(2000);
	
	 driver.findElement(By.id("com.guidejunior:id/dob")).sendKeys("30/11/1999");
	 // String month = "November 1999" ; 
	 // String year = "1999" ;                                                
	// String day = "10" ; 
	  
	Thread.sleep(2000);
	 driver.findElement(By.id("com.guidejunior:id/gender_male")).click();	

	/*while(true) {
		
		String monthyear = driver.findElement(By.id("com.guidejunior:id/month_navigation_fragment_toggle")).getText();
	
	if(monthyear.equalsIgnoreCase(month))
		break;
		
	
	else 
		driver.findElement(By.id("com.guidejunior:id/month_navigation_previous")).click();
	
	}
	
	MobileElement particulardate = driver.findElement(By.className("android.widget.TextView"));
	
	for (iterable_type iterable_element : particulardate) {
		
		
	}*/
	 
	 driver.findElement(By.id("com.guidejunior:id/pick_up_address")).click();
	 
	 driver.findElement(By.id("com.guidejunior:id/next")).click();
	 
	 Thread.sleep(5000);
	 
	 driver.findElement(By.id("com.guidejunior:id/guardian_radio_button")).click();
	 
	 driver.findElement(By.id("com.guidejunior:id/first_name")).sendKeys("siva");
	 
	 driver.findElement(By.id("com.guidejunior:id/last_name")).sendKeys("ganeshan");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("com.guidejunior:id/mobile_number")).sendKeys("9494905982");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("com.guidejunior:id/next")).click();
	 
	}
}



