package com.Intel_Maven;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
;
public class Calculator {
	static AppiumDriver <MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//  setting device properties 
		DesiredCapabilities capablities= new DesiredCapabilities ();
		capablities.setCapability("platformName", "Android");
		capablities.setCapability("platformVersion", "7.0");
		capablities.setCapability("deviceName", "Power_2");
		capablities.setCapability("udid", "0123456789ABCDEF");
		capablities.setCapability("appPackage", "com.guidejunior");
		capablities.setCapability("appActivity", "com.guidejunior.ui.router.RouterActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub"); // connecting  , appium port to local host port
		
		driver=new AppiumDriver<MobileElement>(url,capablities); // launching appium driver

		driver.findElement(By.id("com.guidejunior:id/student_layout")).click();
		 
		driver.findElement(By.id("com.guidejunior:id/update_label")).click();
		driver.findElement(By.id("com.guidejunior:id/email_log_in")).click();
		
	}
	
 }
