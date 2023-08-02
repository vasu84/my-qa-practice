package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parameter_Run {
	public static WebDriver driver;
	@BeforeClass
	//@Parameters("browserlaunch")
public void browserLaunch(String browserlaunch) {
	// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver",
		"C:\\Users\\XSC-10286\\eclipse-workspace\\java_practice\\Driver\\msedgedriver.exe");
driver=new EdgeDriver();
}
}
