package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=976348338945955498&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061928&hvtargid=kwd-10573980&hydadcr=14453_2316415");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//Mouse events
Actions ac = new Actions(driver);
ac.click(search).build().perform();
ac.contextClick(search).build().perform();
//keyboard events
Robot r = new Robot();
 r.keyPress(KeyEvent.VK_DOWN);      // down arrow is pressed
 r.keyRelease(KeyEvent.VK_DOWN);    // down arrow is released
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
// r.keyPress(KeyEvent.VK_ENTER);
// r.keyRelease(KeyEvent.VK_ENTER);
 
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_V);
 //search.click();
 search.clear();

	}

}
