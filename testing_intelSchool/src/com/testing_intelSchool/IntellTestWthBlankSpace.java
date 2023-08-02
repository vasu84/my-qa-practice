package com.testing_intelSchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IntellTestWthBlankSpace {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
				username.sendKeys(" "); // we are giving user name(input)
				String enteredText= username.getAttribute("value");
				System.out.println(enteredText);
			}
			else
				System.out.println("user name text box is not enabled");
			
		}
		
		else
			System.out.println("user name text box is not displayed");
		Thread.sleep(1200);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(" ");
		WebElement login = driver.findElement(By.id("user-login"));
		login.click();
		Thread.sleep(1500);
		
		//registration page
		
		//Register Your Institute
		
		WebElement registeruser = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/div/a"));
		registeruser.click();
		WebElement instName = driver.findElement(By.id("school_Name"));
		instName.sendKeys(" ");
		Thread.sleep(1000);
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys(" ");
		Thread.sleep(1500);
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys(" ");
		Thread.sleep(1500);
		WebElement city = driver.findElement(By.id("reg_City"));
		city.sendKeys(" ");
		Thread.sleep(1500);
		
		WebElement state = driver.findElement(By.id("reg_states"));
		state.click();
		
		Select a = new Select(state); // here it's import select method from selenium
		a.selectByIndex(15);  // 
		Thread.sleep(2000);
		
		//a.selectByVisibleText(" ");
		
		Thread.sleep(1200);
		WebElement pincode = driver.findElement(By.id("reg_zip"));
		pincode.sendKeys(" ");
		
		
		//Center Admin Login
		
		WebElement fName = driver.findElement(By.id("first_Name"));
		fName.sendKeys(" ");
		Thread.sleep(1200);
		
		WebElement lName = driver.findElement(By.id("last_Name"));
		lName.sendKeys(" ");
		Thread.sleep(1200);
		
		WebElement mail = driver.findElement(By.id("reg_Email"));
		mail.sendKeys(" ");
		Thread.sleep(1200);
		
		WebElement mobile = driver.findElement(By.id("reg_mobile"));
		mobile.sendKeys(" ");
		Thread.sleep(1200);
		
		WebElement userName = driver.findElement(By.id("user_Name"));
		userName.sendKeys(" ");
		Thread.sleep(1200);
		
		WebElement passWord = driver.findElement(By.id("password"));
		 passWord.sendKeys(" ");
		 Thread.sleep(1200);
		
		WebElement confirmpassWord = driver.findElement(By.id("confirm_password"));
		 confirmpassWord.sendKeys(" ");
		 Thread.sleep(1200);
		
		WebElement instlogo = driver.findElement(By.id("reg_logo"));
		instlogo.click();
		Thread.sleep(1800);
		
        WebElement submit = driver.findElement(By.id("reg_sub"));
		submit.click();
		Thread.sleep(1200);
		
		/* WebElement cancel = driver.findElement(By.id("cancel_regPage"));
			cancel.click();
			Thread.sleep(1200);
			
			 WebElement back = driver.findElement(By.id("reg_back"));
				back.click();*/
	}

}
