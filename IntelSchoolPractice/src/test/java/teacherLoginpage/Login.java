package teacherLoginpage;

import org.testng.annotations.Test;

import baseClass.BaseClass;

public class Login extends BaseClass {
	
	@Test
	

	public void login() {
	
		driver.get("https://portal.intelschool.in/");
		
	}
	
}
