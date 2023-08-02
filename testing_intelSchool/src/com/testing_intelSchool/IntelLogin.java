package com.testing_intelSchool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class IntelLogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
	  // giving driver executable. to interact with chrome web
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		 
		// launching web browser
		WebDriver driver = new ChromeDriver();
		
		// getting specific web page through url
		driver.get("https://portal.intelschool.in/");
		
		driver.manage().window().maximize(); // Maximizing the window
		
		
		WebElement username = driver.findElement(By.id("username")); //  we are finding elements by id
		
		if(username.isDisplayed()){ // login box is displayed or not
			if(username.isEnabled()) { // login box enabled or not
				username.sendKeys("missleman"); // we are giving user name(input)
				String enteredText= username.getAttribute("value");   //creating object and getting the value what we printed in user name field
				System.out.println(enteredText);  // print the value in console(output)page
			}
			else
				System.out.println("user name text box is not enabled");
			
		}
		
		else
			System.out.println("user name text box is not displayed");
		Thread.sleep(1200);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("zdt6xfy7");
		
		WebElement login = driver.findElement(By.id("user-login"));
		login.click();
		Thread.sleep(1500);
		
		
		//registration page
		
		//Register Your Institute
		         //  finding register user by link text   
		WebElement registeruser = driver.findElement(By.linkText("Register Your School"));
		registeruser.click();
		
		//using id
		WebElement instName = driver.findElement(By.id("school_Name"));
		instName.sendKeys("apj abdulkalam");
		Thread.sleep(1000);
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("rameswaram, temple street");
		Thread.sleep(1500);
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("tamilanadu,562314");
		Thread.sleep(1500);
		
		WebElement city = driver.findElement(By.id("reg_City"));
		city.sendKeys("Rameswaram");
		Thread.sleep(1500);
		
		WebElement state = driver.findElement(By.id("reg_states"));
		state.click();
		state.sendKeys("Andhra Pradesh");
		
		/*Select a = new Select(state); // here it's import select method from selenium
		a.selectByIndex(15);  // 
		Thread.sleep(2000);
		
		a.selectByVisibleText("Tamil Nadu");  */
		
		Thread.sleep(1200);
		WebElement pincode = driver.findElement(By.id("reg_zip"));
		pincode.sendKeys("256489");
		
		
	/*	//Center Admin Login
		
		WebElement fName = driver.findElement(By.id("first_Name"));
		fName.sendKeys("kalam");
		Thread.sleep(1200);
		
		WebElement lName = driver.findElement(By.id("last_Name"));
		lName.sendKeys("president");
		Thread.sleep(1200);
		
		WebElement mail = driver.findElement(By.id("reg_Email"));
		mail.sendKeys("presidentkalam@gmail.com");
		Thread.sleep(1200);
		
		WebElement mobile = driver.findElement(By.id("reg_mobile"));
		mobile.sendKeys("2365897410");
		Thread.sleep(1200);
		
		WebElement userName = driver.findElement(By.id("user_Name"));
		userName.sendKeys("missleman");
		Thread.sleep(1200);
		
		WebElement passWord = driver.findElement(By.id("password"));
		 passWord.sendKeys("zdt7xfy8");
		 Thread.sleep(1200);
		
		WebElement confirmpassWord = driver.findElement(By.id("confirm_password"));
		 confirmpassWord.sendKeys("zdt7xfy8");
		 Thread.sleep(1200);   */
		
		WebElement instlogo = driver.findElement(By.id("reg_logo"));
		instlogo.click();
		Thread.sleep(1800);
		
		  // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection a = new StringSelection("C:\\Users\\XSC-10286\\Desktop\\intel.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(a, null);
	 
	     // press Contol+V for pasting
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
		
		
       /* WebElement submit = driver.findElement(By.id("reg_sub"));
		submit.click();
		Thread.sleep(1200);
		
		 WebElement cancel = driver.findElement(By.id("cancel_regPage"));
			cancel.click();
			Thread.sleep(1200);
			
			 WebElement back = driver.findElement(By.id("reg_back"));
				back.click();
				Thread.sleep(1200); */

	}

}
