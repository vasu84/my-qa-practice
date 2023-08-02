package com.guidejuniorLive.guideJuniorsTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	
	public static AppiumDriver driver; 
	public static String screenshotSubFolderName;
	
	@BeforeSuite
	public void setup() throws MalformedURLException, InterruptedException {
		
		// setting device properties
		
		DesiredCapabilities caps= new DesiredCapabilities();
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("deviceName", "D2502");
		caps.setCapability("udid", "YT910XK7FL");
		caps.setCapability("appPackage", "com.guidejunior");
		caps.setCapability("appActivity", "com.guidejunior.ui.router.RouterActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub"); // connecting appium to local host
		Thread.sleep(2000);
		driver = new AppiumDriver(url, caps);
		Thread.sleep(2000);
	
	}

	@AfterSuite
	public void tearout() {
	
		driver.quit();
		
	}
	
	
	public static void captureScreenShot(String fileName) {
		
		if(screenshotSubFolderName==null) {
		
			LocalDateTime myDate= LocalDateTime.now();
			
			DateTimeFormatter  myFormat= DateTimeFormatter.ofPattern("ddd/mm/yyyy/hh/mm/ss");
			
			screenshotSubFolderName=myDate.format(myFormat);
		}
		
		
		TakesScreenshot screenshot= driver;
		
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./GJ_ScreenShots/"+ screenshotSubFolderName +fileName);
		
		try {
			
			FileUtils.copyFile(sourceFile, destFile);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	 System.out.println("screen shot taken successfully");
	 
	 
	}
	
}
