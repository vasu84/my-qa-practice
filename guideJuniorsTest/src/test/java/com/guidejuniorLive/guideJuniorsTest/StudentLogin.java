package com.guidejuniorLive.guideJuniorsTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StudentLogin extends BaseClass {
	
	@Test(priority=1)
	public void dashboard()
	{
		
	driver.findElement(By.id("com.guidejunior:id/student_layout")).click();
	
	}
	

}
