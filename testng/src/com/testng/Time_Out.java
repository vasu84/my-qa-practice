package com.testng;

import org.testng.annotations.Test;

public class Time_Out {

	@Test(timeOut=1000)
	public void browserLaunch() throws InterruptedException {
		// TODO Auto-generated method stub
		
System.out.println("siva");
//Thread.sleep(2000);

System.out.println("vasu");
Thread.sleep(1000);
System.out.println("My angel");
	}
}
