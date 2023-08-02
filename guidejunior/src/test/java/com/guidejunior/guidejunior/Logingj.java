/**
 * 
 */
package com.guidejunior.guidejunior;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author XSC-10286
 *
 */
public class Logingj {
	static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capablities= new DesiredCapabilities ();
		capablities.setCapability("platformName", "Android");
		capablities.setCapability("platformVersion", "7.1.2");
        capablities.setCapability("appium-version", "1.6.3");

		capablities.setCapability("deviceName", "LG K9");
		capablities.setCapability("udid", "LMX2103b4ba861");
		capablities.setCapability("appPackage", "com.guidejunior");
		capablities.setCapability("appActivity", "com.guidejunior.ui.router.RouterActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
				driver=new AppiumDriver(url,capablities);
				System.out.println("passed");
			////	driver = new AppiumDriver(new URL("http://192.168.1.2:4723/wd/hub"),capablities);
    }
	}


