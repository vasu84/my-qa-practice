package com.seleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHTMLcontrols {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		         //selecting text boxes
		driver.findElement(By.id("firstName")).sendKeys("ärjuna"); // this is one type for selecting and giving input
		WebElement lName = driver.findElement(By.id("lastName"));
		lName.sendKeys("dharma");
             Thread.sleep(2000);
              // selecting  radio buttons
          
         WebElement gender = driver.findElement(By.id("femalerb"));   
         gender.click(); 
           Thread.sleep(2000);
           
                 driver.findElement(By.id("malerb")).click();
                      Thread.sleep(2000);
                      
               // selecting check boxes       
         driver.findElement(By.id("englishchbx")).click();
          Thread.sleep(2000);
          
         WebElement spanish = driver.findElement(By.id("spanishchbx"));
         spanish.click();
         boolean language = spanish.isSelected();
         System.out.println(language+"  spanish is selected ");
         Thread.sleep(3000);
         spanish.click();  //or
         
         WebElement french = driver.findElement(By.id("frenchchbx")); 
         french.click();  // here we are selecting the French check box
            Thread.sleep(3000);
            
         if (french.isSelected());
        	 french.click();   // here we are unselecting the French check box
        	
        	 // button
        	 
        WebElement register = driver.findElement(By.id("registerbtn"));
        register.click();
       System.out.println(driver.findElement(By.id("msg")).getText()); // here we are getting the label text (registration successfully) of the registration button in the console.
         
        // link text
        
        WebElement linktext = driver.findElement(By.linkText("Click here to navigate to the home page"));
        linktext.click();
        
        
       
	}

}
