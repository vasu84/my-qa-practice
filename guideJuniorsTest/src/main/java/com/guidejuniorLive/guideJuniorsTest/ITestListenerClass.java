package com.guidejuniorLive.guideJuniorsTest;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseClass  implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getTestContext().getName()+ "  " + result.getMethod().getMethodName());

		captureScreenShot(result.getTestContext().getName() + " " + result.getMethod().getMethodName()+ ".jpg");
	

	}

	
}
