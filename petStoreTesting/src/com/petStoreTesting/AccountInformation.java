package com.petStoreTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountInformation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		
		         // USER INFORMATION
		WebElement username = driver.findElement(By.name("username"));
		
		if (username.isDisplayed()) {
			if(username.isEnabled()) {
				username.sendKeys("petstore");
				String a=username.getAttribute("value");
				System.out.println(a);
			}
			else
				System.out.println("username box is not enabled");
		}
		
		else
			System.out.println("username box is not displayed");

		Thread.sleep(1500);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("2563zsdg");
		Thread.sleep(1000);
		
		WebElement repeatpassword = driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("2563zsdg");
		Thread.sleep(1000);
		
		  // Account Information
		
		WebElement fName = driver.findElement(By.name("account.firstName"));
		fName.sendKeys("chandar");
		Thread.sleep(1000);
		
		WebElement lName = driver.findElement(By.name("account.lastName"));
	    lName.sendKeys("tirupati");
		Thread.sleep(1000);
		
		WebElement mail = driver.findElement(By.name("account.email"));
		mail.sendKeys("chandra@gmail.com");
		Thread.sleep(1000);
		
		WebElement mobile= driver.findElement(By.name("account.phone"));
		mobile.sendKeys("2658974525");
		Thread.sleep(1000);
		
		WebElement address1= driver.findElement(By.name("account.address1"));
		address1.sendKeys(" rk beach, rk mandir");
		Thread.sleep(1000);
		
		WebElement address2= driver.findElement(By.name("account.address2"));
		address2.sendKeys("vizag,ap");
		Thread.sleep(1000);
		
		WebElement city= driver.findElement(By.name("account.city"));
		city.sendKeys("vizag");
		Thread.sleep(1000);
		
		WebElement pincode= driver.findElement(By.name("account.zip"));
		pincode.sendKeys("256983");
		Thread.sleep(1000);
		
		WebElement state= driver.findElement(By.name("account.state"));
		state.sendKeys("andhrapradesh");
		Thread.sleep(1000);
		
		WebElement country= driver.findElement(By.name("account.country"));
		country.sendKeys("india");
		Thread.sleep(1000);   
		
		  
		//Profile Information
		WebElement language= driver.findElement(By.name("account.languagePreference"));
		language.click();
		Thread.sleep(1000);
		 Select a= new Select(language);
		// a.selectByIndex(1);
		 Thread.sleep(3000);
	 a.selectByVisibleText("japanese"); 
		 
		  WebElement pet= driver.findElement(By.name("account.favouriteCategoryId"));
			pet.click();
			Thread.sleep(2000);
			 Select b=new Select(pet);
			 b.selectByIndex(1);
			 Thread.sleep(3000);
			// a.selectByValue(2);
			 b.selectByVisibleText("REPTILES"); 
			 
			 WebElement mylist= driver.findElement(By.name("account.listOption"));
				mylist.click();
				boolean selected = mylist.isSelected(); //// here we r assigning it to local variable , creating boolean value by pressing  ctrl+2;
				System.out.println("The element is selected :"+selected);
			 
				Thread.sleep(1500);
				 WebElement myBanner= driver.findElement(By.name("account.bannerOption"));
					myBanner.click();
					boolean d = myBanner.isSelected(); 
					System.out.println(d + "-- it's checked");
					Thread.sleep(2500);     
					
					
					// menu button(jpet store image)
					        // selecting menu image
		WebElement menuimage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a/img"));
		  menuimage.click();
		  Thread.sleep(2000); 
		                   // select cart
		WebElement cart = driver.findElement(By.name("img_cart")); 
			cart.click();	
			Thread.sleep(2000);
			               // select fish in  main image  page
		WebElement fish = driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[1]/img"));	
			fish.click();	
			Thread.sleep(2000);
			
			WebElement returnToMenu1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
             returnToMenu1.click();
            Thread.sleep(2500);	
			                     // select dogs in main image  page
			WebElement dogs= driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[2]/img"));	
				dogs.click();	
				Thread.sleep(2000);
				
				WebElement returnToMenu2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
	             returnToMenu2.click();
	            Thread.sleep(3000);	
				                      // select reptails in main image  page
				WebElement reptiles= driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[3]/img"));	
					reptiles.click();	
					Thread.sleep(2000);
					          
				//	WebElement returnToMenu3 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
		        //    returnToMenu3.click();
		        //    Thread.sleep(3000);	
					               // select cat in main image  page
					WebElement cats = driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[4]/img"));	
						cats.click();	
						Thread.sleep(2000);
						
					//	WebElement returnToMenu4 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
			          //  returnToMenu4.click();
			        //    Thread.sleep(3000);	
						         // select bird in main image  page
						WebElement birds = driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[5]/img"));	
							birds.click();	
							Thread.sleep(2000);
							
						WebElement returnToMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
			                returnToMenu.click();
			                Thread.sleep(3000);  
			                
			 // selecting pets and add to catlog                
			                    // selecting bird image
			                WebElement birdsimg = driver.findElement(By.xpath("//area[@alt='Birds'][1]"));	
							birdsimg.click();	
							Thread.sleep(2000);  
							
							WebElement selectBird = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a"));	
							selectBird.click();	
							Thread.sleep(2000); 
							
							  // adding it to cart
			                WebElement addBirdToCart = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[5]/a"));	
			                addBirdToCart.click();	
							Thread.sleep(2000); 
							
							WebElement birdinCart = driver.findElement(By.name("EST-18"));
							 
	//mouse actions
							Actions ac=new Actions(driver); // creating object for mouse actions
							ac.doubleClick(birdinCart).build().perform();
							Thread.sleep(2000);
							
	// Keyboard actions
							Robot r = new Robot(); // creating object for keyboard actions
							r.keyPress(KeyEvent.VK_DELETE); 
							r.keyRelease(KeyEvent.VK_DELETE);
							Thread.sleep(2000);
							
							birdinCart.sendKeys("50"); // change the number in the  quantity field
							Thread.sleep(2000);
							
							WebElement updateCart = driver.findElement(By.name("updateCartQuantities"));
							updateCart.click();
							Thread.sleep(2000);
	
							WebElement checkout = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a"));
							checkout.click();
							
							
						WebElement menuimage1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a/img"));
							  menuimage1.click();
							  Thread.sleep(2000);
							  
					           WebElement catimage = driver.findElement(By.xpath("//area[@alt='Cats']"));
							       catimage.click();
							       Thread.sleep(2000);
							       
							       WebElement catToCart = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a"));
							       catToCart.click();
							       Thread.sleep(2000);  
							       
							    WebElement returntoFLDSH = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
							     returntoFLDSH.click();
							     Thread.sleep(2000); 
							     
							       WebElement catToCart1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[3]/td[1]/a"));
							       catToCart1.click();
							       Thread.sleep(2000);  
							       
	}
	

}
