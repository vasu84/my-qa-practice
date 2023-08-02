package com.guidejuniorLive.guideJuniorsTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class IretryAnalyzerClass implements IRetryAnalyzer {

	int retryCount = 0;
	int maxretryCount=4;
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCount<maxretryCount) {
			retryCount++;
			return true;
			
		}
		return false;
	}

	
}
